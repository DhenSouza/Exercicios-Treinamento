package br.com.stefanini.pme.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prova {

	private Integer idProva;
	private String descricao;

	private List<String> questoes;
	
	{
		questoes = new ArrayList<String>();
	}

	public Prova() {
		super();
	}

	public Prova(Integer idProva, String descricao, List<String> questoes) {
		super();
		this.idProva = idProva;
		this.descricao = descricao;
		this.questoes = questoes;
	}

	public void add(String questao) {
		questoes.add(questao);
	}



	public Integer getIdProva() {
		return idProva;
	}

	public void setIdProva(Integer idProva) {
		this.idProva = idProva;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<String> getQuestoes() {
		if (this.questoes == null) {
			this.questoes = new ArrayList<String>();
		}
		return Collections.unmodifiableList(questoes);
	}

	public void setQuestoes(List<String> questoes) {
		this.questoes = questoes;
	}

	public void addQuestao(String questao) {
		this.questoes.add(questao);
	}

}
