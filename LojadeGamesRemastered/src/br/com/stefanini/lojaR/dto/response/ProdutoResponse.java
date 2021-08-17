package br.com.stefanini.lojaR.dto.response;

public class ProdutoResponse {

	private String nome;
	private String descricao;
	private Double preco;

	public ProdutoResponse() {
	}

	public ProdutoResponse(String nome, String descricao, Double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "ProdutoResponse [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
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

}
