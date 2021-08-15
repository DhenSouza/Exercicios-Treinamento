package br.com.stefanini.pme.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.stefanini.pme.entities.services.GabaritoService;

public class Aluno {

	private Integer idAluno;
	private String nome;

	private Prova prova;

	private List<String> possiveisRespostas = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{
			add("A");
			add("B");
			add("C");
			add("D");
		}
	};

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

	public void verQuestoesRespondidas() {
		for (String v : prova.getQuestoes()) {
			System.out.print(v);
		}

	}

	public void responderQuestoesDaProva() {
		prova = new Prova();
		for (int i = 0; i < 8; i++) {
			Collections.shuffle(possiveisRespostas);

			prova.add(possiveisRespostas.stream().findFirst().get());
		}
	}

	public void corrigirProva(GabaritoService gabarito) {
		List<String> respostasCorretas = gabarito.getRespostas();
		List<String> questoesRespondidas = prova.getQuestoes();

		for (int i = 0; i < respostasCorretas.size(); i++) {
			if (respostasCorretas.get(i).equals(questoesRespondidas.get(i))) {
				System.out.println("Questoes Respondias " + prova.getQuestoes());
				System.out.println("Questao numero: " + (i + 1) + " " + " Estao corretas");
			} else {
				System.out.println("Questoes Respondias " + prova.getQuestoes());
				System.out.println("Questao numero: " + (i + 1) + " " + " Não Estao corretas");
			}
		}
	}

}
