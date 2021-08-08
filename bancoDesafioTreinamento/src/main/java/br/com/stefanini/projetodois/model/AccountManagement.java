package br.com.stefanini.projetodois.model;

public class AccountManagement {

	private Integer idManagement;
	private String operacao;
	private Double valor;

	private AccountHolder accountHolder;

	public AccountManagement() {
	}

	public AccountManagement(Integer idManagement, String operacao, Double valor) {
		super();
		this.idManagement = idManagement;
		this.operacao = operacao;
		this.valor = valor;
	}

	public Integer getIdManagement() {
		return idManagement;
	}

	public void setIdManagement(Integer idManagement) {
		this.idManagement = idManagement;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	@Override
	public String toString() {
		return "AccountManagement [idManagement=" + idManagement + ", operacao=" + operacao + ", valor=" + valor
				+ ", accountHolder=" + accountHolder + "]";
	}

}
