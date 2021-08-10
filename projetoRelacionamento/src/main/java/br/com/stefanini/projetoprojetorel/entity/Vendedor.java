package br.com.stefanini.projetoprojetorel.entity;

import java.io.Serializable;

public class Vendedor extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private String perfil;
	private Double comissao;

	public Vendedor() {

	}

	public Vendedor(Integer id, String nome, String email, String senha, String perfil, Double comissao) {
		super(id, nome, email, senha);
		this.perfil = perfil;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Vendedor [perfil=" + perfil + ", comissao=" + comissao + "]";
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	@Override
	public void gerarCriptografia() throws Exception {

	}

}
