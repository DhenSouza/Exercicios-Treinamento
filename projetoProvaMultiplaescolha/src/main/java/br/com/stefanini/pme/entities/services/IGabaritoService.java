package br.com.stefanini.pme.entities.services;

import java.util.List;

public interface IGabaritoService {

	
	public List<String> getRespostas();
	
	public void adicionarRespostas(List<String> respostas);
}
