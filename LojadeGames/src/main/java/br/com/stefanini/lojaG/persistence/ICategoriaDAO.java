package br.com.stefanini.lojaG.persistence;

import br.com.stefanini.lojaG.entities.Categoria;

public interface ICategoriaDAO {
	
	
	public Categoria findByIdCategoria(int id) throws Exception;
	
	public Integer gravarCategoria(Categoria produto) throws Exception;

}
