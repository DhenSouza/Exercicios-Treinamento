package br.com.stefanini.loja.entities;

public class Endereco {

	private Integer idEndereco;
	private String bairro;
	private String cidade;

	private Cliente cliente;

	public Endereco() {
		super();
	}
	
	

	public Endereco(Integer idEndereco, String bairro, String cidade) {
		super();
		this.idEndereco = idEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
	}



	public Endereco(Integer idEndereco, String bairro, String cidade, Cliente cliente) {
		super();
		this.idEndereco = idEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cliente = cliente;
	}

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Endereco [idEndereco=" + idEndereco + ", bairro=" + bairro + ", cidade=" + cidade + ", cliente="
				+ cliente + "]";
	}

}
