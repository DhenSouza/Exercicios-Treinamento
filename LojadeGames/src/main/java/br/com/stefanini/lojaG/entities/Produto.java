package br.com.stefanini.lojaG.entities;

public class Produto {

	private Integer idProduto;
	private String nome;
	private String descricao;
	private String anoLançamento;
	private Double preco;

	private Categoria categoria;

	public Produto() {
		super();
	}

	public Produto(Integer idProduto, String nome, String descricao, String anoLançamento, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLançamento = anoLançamento;
		this.preco = preco;
	}

	public Produto(Integer idProduto, String nome, String descricao, String anoLançamento, Double preco,
			Categoria categoria) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLançamento = anoLançamento;
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

	public String getAnoLançamento() {
		return anoLançamento;
	}

	public void setAnoLançamento(String anoLançamento) {
		this.anoLançamento = anoLançamento;
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
