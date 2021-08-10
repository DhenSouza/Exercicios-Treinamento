package br.com.stefanini.projetoprojetorel.persistence;

import br.com.stefanini.projetoprojetorel.dto.response.ClienteDTO;

public interface IClienteDAO {

	public ClienteDTO findByIdCliente(int code) throws Exception;

}
