package br.com.stefanini.lojaG.entities;

public class Produto {

	private Integer idProduto;
	private String nome;
	private String descricao;
	private String anoLanšamento;
	private Double preco;

	private Categoria categoria;

	public Produto() {
		super();
	}

	public Produto(Integer idProduto, String nome, String descricao, String anoLanšamento, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLanšamento = anoLanšamento;
		this.preco = preco;
	}

	public Produto(Integer idProduto, String nome, String descricao, String anoLanšamento, Double preco,
			Categoria categoria) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLanšamento = anoLanšamento;
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

	public String getAnoLanšamento() {
		return anoLanšamento;
	}

	public void setAnoLanšamento(String anoLanšamento) {
		this.anoLanšamento = anoLanšamento;
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
