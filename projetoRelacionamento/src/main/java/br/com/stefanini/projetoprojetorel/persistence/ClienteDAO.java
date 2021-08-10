package br.com.stefanini.projetoprojetorel.persistence;

import br.com.stefanini.projetoprojetorel.dto.response.ClienteDTO;

public class ClienteDAO extends DAO implements IClienteDAO {

	@Override
	public ClienteDTO findByIdCliente(int code) throws Exception {
		open();

		stmt = connect.prepareStatement(
				"select u.id, u.nome, u.email, u.senha, c.perfil, c.status from usuario u left join cliente c on "
						+ "  u.id = c.idCliente and " + " c.idCliente=?");

		stmt.setInt(1, code);
		rs = stmt.executeQuery();
		ClienteDTO clienteDTO = null;
		if (rs.next()) {
			clienteDTO = new ClienteDTO();
			clienteDTO.setIdCliente(rs.getInt(1));
			clienteDTO.setNome(rs.getString(2));
			clienteDTO.setEmail(rs.getString(3));
			clienteDTO.setSenha(rs.getString(4));
			clienteDTO.setPerfil(rs.getString(5));
			clienteDTO.setStatus(rs.getString(6));
		}

		close();
		return clienteDTO;

	}

	public static void main(String[] args) {

		try {
			ClienteDTO dto = new ClienteDAO().findByIdCliente(1);
			System.out.println(dto);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
