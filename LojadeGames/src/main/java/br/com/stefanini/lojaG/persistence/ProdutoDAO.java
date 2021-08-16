package br.com.stefanini.lojaG.persistence;

import br.com.stefanini.lojaG.dto.services.ProdutoService;
import br.com.stefanini.lojaG.entities.Produto;

public class ProdutoDAO extends DAO implements IProdutoDAO {

	@Override
	public Produto findByIdProduto(int id) throws Exception {
		open();
		stmt = connect.prepareStatement("select * from produto where idProduto=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();

		Produto produto = null;
		ProdutoService prod = new ProdutoService();
		if (rs.next()) {
			produto = new Produto();

			prod.validacaoProduto(produto);
			produto.setIdProduto(rs.getInt(1));
			produto.setNome(rs.getString(2));
			produto.setDescricao(rs.getString(3));

		}

		close();
		return produto;
	}

	@Override
	public void gravarProduto(Produto produto) throws Exception {
		open();
		stmt = connect.prepareStatement(
				"insert into produto (idProduto, nome, descricao, anoLancamento, preco) values (null, ?, ?, ?, ?)");
		stmt.setString(1, produto.getNome());
		stmt.setString(2, produto.getDescricao());
		stmt.setString(3, produto.getAnoLançamento());
		stmt.setDouble(4, produto.getPreco());

		stmt.execute();
		stmt.close();

		close();

	}

}
