package br.com.stefanini.lojaR.controller;

import br.com.stefanini.lojaR.persistence.ProdutoDAO;

public class Test {
	public static void main(String[] args) {
		ProdutoDAO prod = new ProdutoDAO();

		try {
			System.out.println(prod.findByIdProduto(1));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
