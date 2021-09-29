package br.com.stefanini.testelojagamesstruts.dto;

import br.com.stefanini.testelojagamesstruts.models.Produto;

public class RequestProdutoCategoria {
	
	private Produto produto;
	
	public void ofCliente(String nome, String descricao, Double preco) {
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
	
	

}
