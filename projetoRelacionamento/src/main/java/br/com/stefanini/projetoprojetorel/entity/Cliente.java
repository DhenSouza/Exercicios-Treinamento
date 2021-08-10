package br.com.stefanini.projetoprojetorel.entity;

import java.io.Serializable;

public class Cliente extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private String perfil;
	private String status;

	public Cliente() {

	}

	public Cliente(Integer id, String nome, String email, String senha, String perfil, String status) {
		super(id, nome, email, senha);
		this.perfil = perfil;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cliente [perfil=" + perfil + ", status=" + status + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha() + "]";
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
