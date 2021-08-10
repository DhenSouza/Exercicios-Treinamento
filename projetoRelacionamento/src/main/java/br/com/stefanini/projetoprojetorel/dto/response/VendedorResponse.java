package br.com.stefanini.projetoprojetorel.dto.response;

public class VendedorResponse {

	private Integer idVendedor;
	private String nome;
	private String email;
	private String senha;
	private String perfil;
	private Double comissao;

	public VendedorResponse() {

	}

	public VendedorResponse(Integer idVendedor, String nome, String email, String senha, String perfil,
			Double comissao) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "VendedorResponse [idVendedor=" + idVendedor + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", perfil=" + perfil + ", comissao=" + comissao + "]";
	}

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
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

}
