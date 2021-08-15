package br.com.stefanini.lojaG.dto.request;

import br.com.stefanini.lojaG.entities.Produto;

public class ProdutoRequest {

	private Produto produto;

	public ProdutoRequest() {
		produto = new Produto();
	}

	public void ofProduto(String nome, String descricao, String anoLancamento, Double preco) {
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setAnoLançamento(anoLancamento);
		produto.setPreco(preco);
	}

	@Override
	public String toString() {
		return "ProdutoRequest [produto=" + produto + "]";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
