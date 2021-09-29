package br.com.stefanini.testelojagamesstruts.dto;

public class ResponseProdutoCategoria {

	private String nome;
	private String descricao;
	private Double preco;
	private String descricaoCategoria;

	public ResponseProdutoCategoria() {
	}

	public ResponseProdutoCategoria(String nome, String descricao, Double preco, String descricaoCategoria) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.descricaoCategoria = descricaoCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	@Override
	public String toString() {
		return "ResponseProdutoCategoria [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ ", descricaoCategoria=" + descricaoCategoria + "]";
	}

}
