package br.com.stefanini.pme.entities.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.stefanini.pme.entities.Aluno;
import br.com.stefanini.pme.entities.Prova;

public class AlunoService implements IAlunoService {

	private Aluno aluno;
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

	public AlunoService() {
		aluno = new Aluno();
	}

	public AlunoService(Aluno aluno) {
		super();
		this.aluno = aluno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public void verQuestoesRespondidas() {
		for (String v : prova.getQuestoes()) {
			System.out.print(v);
		}

	}

	@Override
	public void responderQuestoesDaProva() {
		prova = new Prova();
		for (int i = 0; i < 8; i++) {
			Collections.shuffle(possiveisRespostas);

			prova.add(possiveisRespostas.stream().findFirst().get());
		}
	}

	@Override
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
