package br.com.stefanini.projetoprojetorel.persistence;

import br.com.stefanini.projetoprojetorel.dto.response.VendedorResponse;

public class VendedorDAO extends DAO implements IVendedorDAO {

	@Override
	public VendedorResponse findByIdVendedor(int code) throws Exception {
		open();

		stmt = connect.prepareStatement(
				"select u.id, u.nome, u.email, u.senha, v.perfil, v.comissao from usuario u left join vendedor v on "
						+ "  u.id = v.idVendedor and " + " v.idVendedor=?");

		stmt.setInt(1, code);
		rs = stmt.executeQuery();
		VendedorResponse vendedorResponse = null;
		if (rs.next()) {
			vendedorResponse = new VendedorResponse();
			vendedorResponse.setIdVendedor(rs.getInt(1));
			vendedorResponse.setNome(rs.getString(2));
			vendedorResponse.setEmail(rs.getString(3));
			vendedorResponse.setSenha(rs.getString(4));
			vendedorResponse.setPerfil(rs.getString(5));
			vendedorResponse.setComissao(rs.getDouble(6));
		}

		close();
		return vendedorResponse;
	}

	public static void main(String[] args) {

		try {
			VendedorResponse dto = new VendedorDAO().findByIdVendedor(2);
			System.out.println(dto);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
