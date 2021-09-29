package br.com.stefanini.testelojagamesstruts.persistence;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.testelojagamesstruts.dto.RequestProdutoCategoria;
import br.com.stefanini.testelojagamesstruts.models.Produto;
import br.com.stefanini.testelojagamesstruts.persistence.interfaces.IProdutoDAO;
import br.com.stefanini.testelojagamesstruts.service.ProdutoService;

public class ProdutoDAO extends DAO implements IProdutoDAO {

	@Override
	public Produto findByIdProduto(Integer id) throws Exception {
		open();
		stmt = connect.prepareStatement("select * from produto where idProduto=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();

		Produto produto = null;
		ProdutoService prod = new ProdutoService();
		if (rs.next()) {
			produto = new Produto();

			produto.setIdProduto(rs.getInt(1));
			produto.setNome(rs.getString(2));
			produto.setDescricao(rs.getString(3));
			produto.setPreco(rs.getDouble(4));

			prod.validacaoProduto(produto);

		}

		close();

		return produto;
	}

	@Override
	public void gravarProduto(Produto produto) throws Exception {
		open();

		stmt = connect
				.prepareStatement("insert into produto (idProduto, nome, descricao, preco) values (null, ?, ?, ?)");
		stmt.setString(1, produto.getNome());
		stmt.setString(2, produto.getDescricao());
		stmt.setDouble(3, produto.getPreco());

		ProdutoService produtoService = new ProdutoService();
		produtoService.validacaoProduto(produto);

		stmt.execute();
		stmt.close();
		close();

	}

	public Integer gravarProdutoCat(RequestProdutoCategoria requestProdCat) throws Exception {
		open();

		Integer id = 0;

		connect.setAutoCommit(false);

		try {

			stmt = connect.prepareStatement(
					"insert into produto (idProduto, nome, descricao, preco) values (null, ?, ?, ?)",
					PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, requestProdCat.getProduto().getNome());
			stmt.setString(2, requestProdCat.getProduto().getDescricao());
			stmt.setDouble(3, requestProdCat.getProduto().getPreco());

			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			rs.next();

			id = rs.getInt(1);
			stmt.close();

			// ---------------------------------------------------------------------- //

			stmtCat = connect.prepareStatement(
					"insert into categoria (idCategoria, descricaoCategoria, produto_id) values (null, ?, ?)");
			stmtCat.setString(1, requestProdCat.getProduto().getCategorias().get(1).getDescricaoCategoria());
			stmtCat.setInt(2, id);
			stmtCat.execute();
			stmtCat.close();
			
			connect.setAutoCommit(true);

		} catch (Exception ex) {
			ex.printStackTrace();
			connect.rollback();
		} finally {
			close();
		}
		return id;
	}

	@Override
	public List<Produto> findAll() throws Exception {
		open();
		stmt = connect.prepareStatement("SELECT * FROM produto");
		rs = stmt.executeQuery();
		List<Produto> lista = new ArrayList<>();
		Produto produto = null;
		while (rs.next()) {
			produto = new Produto();
			produto.setIdProduto(rs.getInt(1));
			produto.setNome(rs.getString(2));
			produto.setDescricao(rs.getString(3));
			produto.setPreco(rs.getDouble(4));
			lista.add(produto);
		}
		close();
		return lista;
	}

	@Override
	public void update(Produto produto) throws Exception {
		open();

		try {
			stmt = connect.prepareStatement("update produto set nome=?, descricao=?, preco=? where idProduto=? ");
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getIdProduto());

			stmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			close();

		}

	}

	@Override
	public void delete(Integer id) throws Exception {
		open();
		stmt = connect.prepareStatement("delete from produto where idProduto=? ");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();
		close();

	}

}
