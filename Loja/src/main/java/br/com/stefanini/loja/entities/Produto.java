package br.com.stefanini.loja.entities;

import java.io.Serializable;

public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer idProduto;
	private String codProduto;
	private String descricaoProduto;
	private int qtdProduto;
	private double valorProduto;

	public Produto() {
		super();
	}

	public Produto(Integer idProduto, String codProduto, String descricaoProduto, int qtdProduto, double valorProduto) {
		super();
		this.idProduto = idProduto;
		this.codProduto = codProduto;
		this.descricaoProduto = descricaoProduto;
		this.qtdProduto = qtdProduto;
		this.valorProduto = valorProduto;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", codProduto=" + codProduto + ", descricaoProduto="
				+ descricaoProduto + ", qtdProduto=" + qtdProduto + ", valorProduto=" + valorProduto + "]";
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
