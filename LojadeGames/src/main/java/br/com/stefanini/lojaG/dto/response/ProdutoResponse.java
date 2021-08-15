package br.com.stefanini.lojaG.dto.response;

public class ProdutoResponse {

	private String nome;
	private String descricao;
	private String nomeCategoria;
	private String plataforma;

	public ProdutoResponse() {
		super();
	}

	public ProdutoResponse(String nome, String descricao, String nomeCategoria, String plataforma) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.nomeCategoria = nomeCategoria;
		this.plataforma = plataforma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
