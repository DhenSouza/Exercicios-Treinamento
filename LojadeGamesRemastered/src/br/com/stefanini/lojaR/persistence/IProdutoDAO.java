package br.com.stefanini.lojaR.persistence;

import java.util.List;

import br.com.stefanini.lojaR.entities.Produto;

public interface IProdutoDAO {
	public Produto findByIdProduto(Integer id) throws Exception;

	public void gravarProduto(Produto produto) throws Exception;

	public List<Produto> findAll() throws Exception;

	public void update(Produto produto) throws Exception;

	public void delete(Integer id) throws Exception;
}
