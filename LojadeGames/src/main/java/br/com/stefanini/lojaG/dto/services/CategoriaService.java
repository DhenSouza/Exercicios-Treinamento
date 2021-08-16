package br.com.stefanini.lojaG.dto.services;

import br.com.stefanini.lojaG.entities.Categoria;

public class CategoriaService {



	public void validacaoCategoria(Categoria cat) {

		try {
			if (cat.getIdCategoria() <= 0) {
				throw new IllegalArgumentException("Id Invalido");
			} else if (cat.getNomeCategoria().length() <= 2) {
				throw new IllegalArgumentException("Descrição Invalida");
			} else if (cat.getPlataforma().length() <= 3) {
				throw new IllegalArgumentException("plataforma invalida");
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		
	}

}
