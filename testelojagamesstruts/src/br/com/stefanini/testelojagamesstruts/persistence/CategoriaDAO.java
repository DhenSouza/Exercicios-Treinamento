package br.com.stefanini.testelojagamesstruts.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.testelojagamesstruts.models.Categoria;
import br.com.stefanini.testelojagamesstruts.persistence.interfaces.ICategoriaDAO;

public class CategoriaDAO extends DAO implements ICategoriaDAO {

	@Override
	public Categoria findByIdCategoria(Integer id) throws Exception {
		open();
		stmt = connect.prepareStatement("select * from categoria where idCategoria=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();

		Categoria categoria = null;
		if (rs.next()) {
			categoria = new Categoria();
			categoria.setIdCategoria(rs.getInt(1));
			categoria.setDescricaoCategoria(rs.getString(2));
		}

		close();
		return categoria;
	}

	@Override
	public void gravarCategoria(Categoria categoria) throws Exception {
		open();
		try {
			stmt = connect
					.prepareStatement("insert into categoria (idCategoria, descricaoCategoria) values (null, ?) ");
			stmt.setString(1, categoria.getDescricaoCategoria());

			stmt.execute();
			stmt.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			close();
		}
	}

	@Override
	public List<Categoria> findAllCategoria() throws Exception {
		open();
		stmt = connect.prepareStatement("SELECT * FROM categoria");
		rs = stmt.executeQuery();

		List<Categoria> categorias = new ArrayList<Categoria>();
		Categoria categoria = null;
		while (rs.next()) {
			categoria = new Categoria();
			categoria.setIdCategoria(rs.getInt(1));
			categoria.setDescricaoCategoria(rs.getString(2));
			categorias.add(categoria);
		}
		close();
		return categorias;
	}

	@Override
	public void update(Categoria categoria) throws Exception {
		open();
		try {
			stmt = connect.prepareStatement("UPDATE categoria set descricaoCategoria=? WHERE idCategoria=?");
			stmt.setString(1, categoria.getDescricaoCategoria());
			stmt.setInt(2, categoria.getIdCategoria());

			stmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			close();
		}

	}

	@Override
	public void delete(Integer id) throws Exception {
		open();
		stmt = connect.prepareStatement("DELETE FROM categoria WHERE idCategoria=?");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();

		close();
	}

	public static void main(String[] args) {
		CategoriaDAO dao = new CategoriaDAO();
		Categoria cat1 = new Categoria();

		try {

			for (Categoria c : dao.findAllCategoria()) {
				System.out.println(c);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Categoria> findByDescricaoCategoria() throws Exception {
		open();
		stmt = connect.prepareStatement("SELECT descricaoCategoria FROM categoria");
		rs = stmt.executeQuery();

		List<Categoria> categorias = new ArrayList<Categoria>();
		Categoria categoria = null;
		while (rs.next()) {
			categoria = new Categoria();
			categoria.setDescricaoCategoria(rs.getString(1));
			categorias.add(categoria);
		}
		close();
		return categorias;
	}

}
