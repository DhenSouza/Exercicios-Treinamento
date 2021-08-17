package br.com.stefanini.lojaR.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.lojaR.dto.service.ProdutoService;
import br.com.stefanini.lojaR.entities.Produto;

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

	@Override
	public List<Produto> findAll() throws Exception {
		open();
		stmt = connect.prepareStatement("select * from produto");
		rs = stmt.executeQuery();
		List<Produto> lista = new ArrayList<Produto>();
		while (rs.next()) {
			Produto produto = new Produto();
			produto.setIdProduto(rs.getInt(1));
			produto.setNome(rs.getString(2));
			produto.setDescricao(rs.getString(3));
			produto.setPreco(rs.getDouble(4));
			lista.add(produto);
		}
		stmt.close();
		close();
		return lista;
	}

	@Override
	public void update(Produto produto) throws Exception {
		open();

		stmt = connect
				.prepareStatement("update produto set nome=?, descricao=?, preco=? where idProduto=? ");
		stmt.setString(1, produto.getNome());
		stmt.setString(2, produto.getDescricao());
		stmt.setDouble(3, produto.getPreco());
		stmt.setDouble(4, produto.getIdProduto());

		stmt.execute();

		close();

	}

	@Override
	public void delete(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();

		try {
			//Produto produto = new Produto(null, "Far cry 3", "melhor jogo do ano 2010", 100.);

			Produto dados = new ProdutoDAO().findByIdProduto(3);
			dados.setNome("The evil within");
			dados.setDescricao("Jogo legalzinho");
			dados.setPreco(400.);
			new ProdutoDAO().update(dados);

			for (Produto i : dao.findAll()) {
				System.out.println(i);
			}
		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

}
