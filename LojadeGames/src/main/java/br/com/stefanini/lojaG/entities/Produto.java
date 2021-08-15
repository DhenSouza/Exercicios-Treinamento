package br.com.stefanini.lojaG.entities;

public class Produto {

	private Integer idProduto;
	private String nome;
	private String descricao;
	private String anoLan�amento;
	private Double preco;

	private Categoria categoria;

	public Produto() {
		super();
	}

	public Produto(Integer idProduto, String nome, String descricao, String anoLan�amento, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLan�amento = anoLan�amento;
		this.preco = preco;
	}

	public Produto(Integer idProduto, String nome, String descricao, String anoLan�amento, Double preco,
			Categoria categoria) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLan�amento = anoLan�amento;
		this.preco = preco;
		this.categoria = categoria;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
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

	public String getAnoLan�amento() {
		return anoLan�amento;
	}

	public void setAnoLan�amento(String anoLan�amento) {
		this.anoLan�amento = anoLan�amento;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
