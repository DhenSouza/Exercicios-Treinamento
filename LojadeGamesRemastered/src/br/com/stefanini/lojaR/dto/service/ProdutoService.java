package br.com.stefanini.lojaR.dto.service;

import br.com.stefanini.lojaR.entities.Produto;

public class ProdutoService {

	public void validacaoProduto(Produto produto) {
		try {

			
			if (produto.getDescricao().length() <= 2) {
				throw new IllegalArgumentException("Descrição Invalida");
			} else
			if (produto.getPreco() <= 0) {
				throw new IllegalArgumentException("produto nao pode ter valor 0");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
