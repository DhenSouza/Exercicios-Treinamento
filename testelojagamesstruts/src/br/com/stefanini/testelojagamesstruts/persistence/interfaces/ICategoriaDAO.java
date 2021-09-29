package br.com.stefanini.testelojagamesstruts.persistence.interfaces;

import java.util.List;

import br.com.stefanini.testelojagamesstruts.models.Categoria;

public interface ICategoriaDAO {
	
	public Categoria findByIdCategoria(Integer id) throws Exception;

	public void gravarCategoria(Categoria categoria) throws Exception;

	public List<Categoria> findAllCategoria() throws Exception;
	
	public List<Categoria> findByDescricaoCategoria() throws Exception;

	public void update(Categoria categoria) throws Exception;

	public void delete(Integer id) throws Exception;

}
