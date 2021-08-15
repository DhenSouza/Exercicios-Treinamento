package br.com.stefanini.loja.service;

import br.com.stefanini.loja.entities.ItemProduto;

public class ProdutoService {
	
	public void gerarPrecoItemProduto(ItemProduto item) throws Exception {
		if (item == null) {
			throw new Exception("Item deve possuir instancia");
		}
		item.setTotal(item.getProduto().getValorProduto() * item.getQtdProduto());
	}

}
