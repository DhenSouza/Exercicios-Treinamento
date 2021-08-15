package br.com.stefanini.lojaG.entities;

import java.util.List;

public class Categoria {

	private Integer idCategoria;

	private String nomeCategoria;

	private String plataforma;

	private List<Produto> produtos;

	public Categoria() {
		super();
	}

	public Categoria(Integer idCategoria, String nomeCategoria, String plataforma) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.plataforma = plataforma;
	}

	public Categoria(Integer idCategoria, String nomeCategoria, String plataforma, List<Produto> produtos) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
		this.plataforma = plataforma;
		this.produtos = produtos;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
