package br.com.stefanini.projetoprojetorel.dto.response;

public class VendedorDTO {

	private Long idVendedor;
	private String nome;
	private String email;
	private String senha;
	private String perfil;
	private Double comissao;

	public VendedorDTO() {

	}

	public VendedorDTO(Long idVendedor, String nome, String email, String senha, String perfil, Double comissao) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		this.comissao = comissao;
	}

	public Long getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Long idVendedor) {
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
