package br.com.stefanini.lojaR.dto.request;

import br.com.stefanini.lojaR.entities.Produto;

public class ProdutoRequest {

	private Produto produto;

	public ProdutoRequest() {
		this.produto = new Produto();
	}

	public void ofProduto( String nome, String descricao, Double preco) {
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setPreco(preco);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "ProdutoRequest [produto=" + produto + "]";
	}

}
