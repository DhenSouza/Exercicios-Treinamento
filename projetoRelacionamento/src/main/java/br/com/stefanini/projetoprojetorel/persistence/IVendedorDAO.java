package br.com.stefanini.projetoprojetorel.persistence;

import br.com.stefanini.projetoprojetorel.dto.response.VendedorResponse;

public interface IVendedorDAO {
	
	public VendedorResponse findByIdVendedor(int code) throws Exception;

}
