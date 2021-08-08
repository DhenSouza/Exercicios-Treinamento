package br.com.stefanini.projetodois.dto;

public class AccountResponse {

	private Integer IdUser;
	private String nome;
	private String operacao;
	private Double valor;

	public AccountResponse() {
	}

	public AccountResponse(Integer idUser, String nome, String operacao, Double valor) {
		super();
		IdUser = idUser;
		this.nome = nome;
		this.operacao = operacao;
		this.valor = valor;
	}

	public Integer getIdUser() {
		return IdUser;
	}

	public void setIdUser(Integer idUser) {
		IdUser = idUser;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

}
