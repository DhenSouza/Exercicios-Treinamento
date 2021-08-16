package br.com.stefanini.pme.entities.services;

public interface IAlunoService {

	public void verQuestoesRespondidas();

	public void responderQuestoesDaProva();

	public void corrigirProva(GabaritoService gabarito);

}
