package br.com.stefanini.projetoprojetorel.persistence;

import br.com.stefanini.projetoprojetorel.dto.response.ClienteResponse;

public interface IClienteDAO {

	public ClienteResponse findByIdCliente(int code) throws Exception;

}
