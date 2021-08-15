package br.com.stefanini.pme.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.stefanini.pme.entities.Aluno;
import br.com.stefanini.pme.entities.services.GabaritoService;

public class AvaliacaoTest {

	public static void main(String[] args) {
		
			List<Aluno> alunos = new ArrayList<>();
			
			  for (int i = 0; i < 5; i++) {
	                Aluno aluno = new Aluno("Denilson");
	               
	                aluno.setIdAluno(i);
	                aluno.responderQuestoesDaProva();
	                
	                

	                alunos.add(aluno);
	            }
			  
			 		  
			  GabaritoService gabaritoService = new GabaritoService();
			  gabaritoService.adicionarRespostas(Collections.nCopies(1, "A"));
	          
	            	
	            for (Aluno aluno : alunos) {
	            	System.out.println();
	            	aluno.corrigirProva(gabaritoService);

	                System.out.println("Id do Aluno" + aluno.getIdAluno() + " Nome do Aluno: " + aluno.getNome());
	            }
	

	}

}
