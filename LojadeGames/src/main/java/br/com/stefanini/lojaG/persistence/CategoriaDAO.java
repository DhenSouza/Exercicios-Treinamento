package br.com.stefanini.lojaG.persistence;

import br.com.stefanini.lojaG.entities.Categoria;
import br.com.stefanini.lojaG.entities.Produto;

public class CategoriaDAO extends DAO implements ICategoriaDAO {

	@Override
	public Categoria findByIdCategoria(int id) throws Exception {
		open();
		stmt = connect.prepareStatement("select * from categoria where idCategoria=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();

		Categoria categoria = null;

		if (rs.next()) {
			categoria = new Categoria();

			categoria.setIdCategoria(rs.getInt(1));
			categoria.setNomeCategoria(rs.getString(2));
			categoria.setPlataforma(rs.getString(3));

		}

		close();
		return categoria;

	}

	@Override
	public Integer gravarCategoria(Categoria categoria) throws Exception {
		open();
		Produto produto = new Produto();
		
		Integer chave = produto.getIdProduto();
		connect.setAutoCommit(false);
		try {

			stmt = connect.prepareStatement(
					"insert into categoria (idCategoria, nomeCategoria, plataforma, id_produto) values (null, ?, ?, ?)");
			stmt.setString(1, categoria.getNomeCategoria());
			stmt.setString(2, categoria.getPlataforma());
			stmt.setInt(3, chave);

			stmt.execute();
			stmt.close();

			connect.setAutoCommit(true);
		} catch (Exception ex) {
			connect.rollback();
			ex.printStackTrace();
		} finally {
			close();
		}
		return chave;
	}

}
