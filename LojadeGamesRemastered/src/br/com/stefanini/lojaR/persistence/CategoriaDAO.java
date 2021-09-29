package br.com.stefanini.lojaR.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.lojaR.entities.Categoria;

public class CategoriaDAO extends DAO {

	public List<Categoria> findAllCategoria() throws Exception {
		open();

		stmt = connect.prepareStatement("select idCategoria, nomeCategoria from categoria");
		rs = stmt.executeQuery();

		List<Categoria> listaCat = new ArrayList<>();

		while (rs.next()) {
			Categoria cat = new Categoria();
			cat.setIdCategoria(rs.getInt(1));
			cat.setNomeCategoria(rs.getString(2));

			listaCat.add(cat);
		}

		close();
		return listaCat;
	}
	
	public Categoria findByIdCategoria(Integer id) throws Exception {
		open();
		stmt = connect.prepareStatement("select * from categoria where idCategoria=?");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		
		Categoria categoria = null;
		
		if(rs.next()) {
			categoria = new Categoria();
			categoria.setIdCategoria(rs.getInt("idCategoria"));
			categoria.setNomeCategoria(rs.getString("nomeCategoria"));
		}
		
		close();
		
		return categoria;
	}
}
