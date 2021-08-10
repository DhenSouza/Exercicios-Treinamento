package br.com.stefanini.projetoprojetorel.controller;

import br.com.stefanini.projetoprojetorel.entity.Vendedor;
import br.com.stefanini.projetoprojetorel.persistence.VendedorDAO;

public class VendedorController {
	public static void main(String[] args) {
		VendedorDAO dao = new VendedorDAO();

		try {
			for (Vendedor v : dao.findAll()) {
				System.out.println(v);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
