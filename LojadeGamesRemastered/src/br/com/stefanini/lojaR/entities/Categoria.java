package br.com.stefanini.lojaR.entities;

import java.io.Serializable;
import java.util.List;

public class Categoria implements Serializable, Comparable<Categoria> {
	private static final long serialVersionUID = 1L;

	private Integer idCategoria;
	private String nomeCategoria;

	private List<Produto> produtos;

	public Categoria() {
	}

	public Categoria(Integer idCategoria, String nomeCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria + ", produtos=" + produtos
				+ "]";
	}

	public Categoria(Integer idCategoria, String nomeCategoria, List<Produto> produtos) {
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCategoria == null) ? 0 : idCategoria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (idCategoria == null) {
			if (other.idCategoria != null)
				return false;
		} else if (!idCategoria.equals(other.idCategoria))
			return false;
		return true;
	}

	@Override
	public int compareTo(Categoria c) {
		return this.idCategoria.compareTo(c.getIdCategoria());
	}

}
