package br.com.stefanini.lojaR.entities;

public class ProdutoCategoria {

	private Produto produto;

	private Categoria categoria;

	public ProdutoCategoria() {
	}

	public ProdutoCategoria(Produto produto, Categoria categoria) {
		super();
		this.produto = produto;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ProdutoCategoria [produto=" + produto + ", categoria=" + categoria + "]";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
