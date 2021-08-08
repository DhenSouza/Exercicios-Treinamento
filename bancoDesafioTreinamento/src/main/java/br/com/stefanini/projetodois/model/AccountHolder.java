package br.com.stefanini.projetodois.model;

import java.util.List;

public class AccountHolder {

	private Integer idAccountHolder;
	private String nome;
	private String email;
	private Double saldo = 0.;
	private String uuid;

	private List<AccountManagement> managements;

	public AccountHolder() {
		super();
	}

	public AccountHolder(Integer idCorrentista, String nome, String email, Double saldo, String uuid) {

		this.idAccountHolder = idCorrentista;
		this.nome = nome;
		this.email = email;
		this.saldo = saldo;
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "AccountHolder [idAccountHolder=" + idAccountHolder + ", nome=" + nome + ", email=" + email + ", saldo="
				+ saldo + ", uuid=" + uuid + ", managements=" + managements + "]";
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Integer getIdAccountHolder() {
		return idAccountHolder;
	}

	public void setIdAccountHolder(Integer idAccountHolder) {
		this.idAccountHolder = idAccountHolder;
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

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<AccountManagement> getManagements() {
		return managements;
	}

	public void setManagements(List<AccountManagement> managements) {
		this.managements = managements;
	}

}
