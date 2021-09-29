package br.com.stefanini.testelojagamesstruts.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idCategoria;

	private String descricaoCategoria;

	private Produto produto;

	public Categoria() {
		super();
	}

	public Categoria(Integer idCategoria, String descricaoCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.descricaoCategoria = descricaoCategoria;
	}

	public Categoria(Produto produto) {
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "descricaoCategoria=" + descricaoCategoria;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

}
