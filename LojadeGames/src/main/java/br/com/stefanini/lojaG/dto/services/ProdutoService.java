package br.com.stefanini.lojaG.dto.services;

import br.com.stefanini.lojaG.entities.Produto;

public class ProdutoService {




	public void validacaoProduto(Produto produto) {
		try {

			if (produto.getIdProduto() <= 0) {
				throw new IllegalArgumentException("Id Invalido");
			} else if (produto.getDescricao().length() <= 2) {
				throw new IllegalArgumentException("Descrição Invalida");
			} else if (produto.getPreco() <= 0) {
				throw new IllegalArgumentException("produto nao pode ter valor 0");
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

}
