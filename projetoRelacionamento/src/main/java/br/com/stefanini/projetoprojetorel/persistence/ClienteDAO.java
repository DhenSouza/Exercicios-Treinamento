package br.com.stefanini.projetoprojetorel.persistence;

import br.com.stefanini.projetoprojetorel.dto.response.ClienteResponse;

public class ClienteDAO extends DAO implements IClienteDAO {

	@Override
	public ClienteResponse findByIdCliente(int code) throws Exception {
		open();

		stmt = connect.prepareStatement(
				"select u.id, u.nome, u.email, u.senha, c.perfil, c.status from usuario u left join cliente c on "
						+ "  u.id = c.idCliente and " + " c.idCliente=?");

		stmt.setInt(1, code);
		rs = stmt.executeQuery();
		ClienteResponse clienteResponse = null;
		if (rs.next()) {
			clienteResponse = new ClienteResponse();
			clienteResponse.setIdCliente(rs.getInt(1));
			clienteResponse.setNome(rs.getString(2));
			clienteResponse.setEmail(rs.getString(3));
			clienteResponse.setSenha(rs.getString(4));
			clienteResponse.setPerfil(rs.getString(5));
			clienteResponse.setStatus(rs.getString(6));
		}

		close();
		return clienteResponse;

	}

	public static void main(String[] args) {

		try {
			ClienteResponse dto = new ClienteDAO().findByIdCliente(1);
			System.out.println(dto);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
