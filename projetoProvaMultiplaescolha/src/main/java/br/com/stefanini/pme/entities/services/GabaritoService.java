package br.com.stefanini.pme.entities.services;

import java.util.Collections;
import java.util.List;

public class GabaritoService  implements IGabaritoService{
	private List<String> respostas;

	public List<String> getRespostas() {
		return Collections.unmodifiableList(respostas);
	}

	public void adicionarRespostas(List<String> respostas) {
		this.respostas = respostas;

	}
}
