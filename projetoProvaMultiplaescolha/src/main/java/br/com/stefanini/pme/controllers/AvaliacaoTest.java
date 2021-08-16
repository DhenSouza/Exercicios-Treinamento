package br.com.stefanini.pme.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.stefanini.pme.entities.services.AlunoService;
import br.com.stefanini.pme.entities.services.GabaritoService;

public class AvaliacaoTest {

	public static void main(String[] args) {

		List<AlunoService> alunos = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
		//	Aluno aluno = new Aluno("Denilson");
			AlunoService aluno = new AlunoService();

			aluno.getAluno().setIdAluno(i);
			aluno.responderQuestoesDaProva();

			alunos.add( aluno);
		}

		GabaritoService gabaritoService = new GabaritoService();
		gabaritoService.adicionarRespostas(Collections.nCopies(1, "A"));

		for (AlunoService aluno : alunos) {
			System.out.println();
			aluno.corrigirProva(gabaritoService);

			System.out.println("Id do Aluno" + aluno.getAluno().getIdAluno() + " Nome do Aluno: " + aluno.getAluno().getNome());
		}

	}

}
