package br.com.stefanini.loja.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.loja.entities.Cliente;
import br.com.stefanini.loja.entities.Endereco;
import br.com.stefanini.loja.entities.ItemProduto;
import br.com.stefanini.loja.entities.Produto;
import br.com.stefanini.loja.entities.Vendas;
import br.com.stefanini.loja.service.ProdutoService;

public class MockController {

	private List<ItemProduto> items;

	{
		this.items = new ArrayList<ItemProduto>();
	}

	public List<ItemProduto> getItems() {
		return items;
	}

	public void setItems(List<ItemProduto> items) {
		this.items = items;
	}

	public void mock() throws Exception {
		
		Produto produto1 = new Produto(1, "ab300", "Caneta", 50, 2);
		Produto produto2 = new Produto(2, "ab301", "Lapiseira", 50, 5);
		Produto produto3 = new Produto(3, "ab302", "Estojo", 50, 10);
		
		
		Endereco endereco1 = new Endereco(1, "Sao Mateus", "São Paulo");
		Endereco endereco2 = new Endereco(2, "Sapopemba", "São Paulo");


		Cliente cliente1 = new Cliente(1, "Denilson", endereco1, produto2);
		Cliente cliente2 = new Cliente(2, "Patricia ", endereco2, produto3);
		Cliente cliente3 = new Cliente(3, "Gabriel", endereco2, produto1);

		Vendas vendas = new Vendas(1, 1);
		ItemProduto item1 = new ItemProduto(produto1, 1);
		ItemProduto item2 = new ItemProduto(produto2, 3);
		ItemProduto item3 = new ItemProduto(produto3, 2);
		ProdutoService service1 = new ProdutoService();
		ProdutoService service2 = new ProdutoService();
		ProdutoService service3 = new ProdutoService();

		service1.gerarPrecoItemProduto(item1);
		service2.gerarPrecoItemProduto(item2);
		service3.gerarPrecoItemProduto(item3);

		items.add(item1);
		items.add(item2);
		items.add(item3);
		vendas.setQntdVendas(items.size());

		System.out.println(items);
		System.out.println("Total de itens vendidos :" + vendas.getQntdVendas());
		System.out.println(cliente1 + "," + cliente2 + "," + cliente3);
	}

	public static void main(String[] args) {
		try {
			new MockController().mock();
		} catch (Exception ex) {
		}
	}
}
