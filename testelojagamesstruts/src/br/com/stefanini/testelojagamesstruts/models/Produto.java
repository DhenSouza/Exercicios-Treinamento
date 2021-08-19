package br.com.stefanini.testelojagamesstruts.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Produto {

	private Integer idProduto;
	private String nome;
	private String descricao;
	private Double preco;

	public Produto() {
		super();
	}

	public Produto(Integer idProduto, String nome, String descricao, Double preco) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ "]";
	}

}
