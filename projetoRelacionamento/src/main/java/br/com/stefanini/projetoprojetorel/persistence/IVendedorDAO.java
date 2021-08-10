package br.com.stefanini.projetoprojetorel.persistence;

import java.util.List;

import br.com.stefanini.projetoprojetorel.entity.Vendedor;

public interface IVendedorDAO {
	
	public List<Vendedor> findAll() throws Exception;

}
