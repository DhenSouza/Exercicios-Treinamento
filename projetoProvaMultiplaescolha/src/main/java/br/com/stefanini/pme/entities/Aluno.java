package br.com.stefanini.pme.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.stefanini.pme.entities.services.GabaritoService;

public class Aluno {

	private Integer idAluno;
	private String nome;

	private Prova prova;



	public Aluno() {
		super();
	}

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public Aluno(Integer idAluno, String nome, Prova prova) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.prova = prova;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", prova=" + prova + "]";
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}


}
