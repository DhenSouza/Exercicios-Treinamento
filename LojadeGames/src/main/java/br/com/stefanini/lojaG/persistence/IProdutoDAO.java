package br.com.stefanini.lojaG.persistence;

import br.com.stefanini.lojaG.entities.Produto;

public interface IProdutoDAO {
	
	public Produto findByIdProduto(int id) throws Exception;
	
	public void gravarProduto(Produto produto) throws Exception;

}
