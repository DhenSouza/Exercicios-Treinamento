package br.com.stefanini.loja.entities;

public class Vendas {

	private Integer idVenda;
	private int qtddVendas;

	public Vendas() {
		
	}

	public Vendas(Integer idVenda, int qntdVendas) {
		super();
		this.idVenda = idVenda;
		this.qtddVendas = qntdVendas;
	}

	@Override
	public String toString() {
		return "Vendas [idVenda=" + idVenda + ", qntdVendas=" + qtddVendas + "]";
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public int getQntdVendas() {
		return qtddVendas;
	}

	public void setQntdVendas(int qntdVendas) {
		this.qtddVendas = qntdVendas;
	}

}
