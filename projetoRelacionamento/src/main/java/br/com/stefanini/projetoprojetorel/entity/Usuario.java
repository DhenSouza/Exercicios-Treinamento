package br.com.stefanini.projetoprojetorel.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;

public abstract class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	// transformar a Classe Objeto

	private Integer id;
	private String nome;
	private String email;
	private String senha;

	public Usuario() {
		super();
	}

	public Usuario(Integer id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void gerarCriptografia() throws Exception {

		String chave = "denilson@gmail.com;www.blogedsonbelem.com.@=1=1;*123+;";

		MessageDigest md5 = MessageDigest.getInstance("MD5");

		this.setSenha(this.getSenha() + chave); // 123profedsonbelem....

		byte[] messageDigest = md5.digest(this.senha.getBytes());// converteu em bytes

		BigInteger no = new BigInteger(1, messageDigest);// biginteger

		String hashText = no.toString(16); // converte em texto

		while (hashText.length() < 32) {
			hashText = "0" + hashText;
		}
		this.setSenha(hashText);
	}

}
