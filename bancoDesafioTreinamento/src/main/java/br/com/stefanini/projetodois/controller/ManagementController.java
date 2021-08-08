package br.com.stefanini.projetodois.controller;

import java.util.ArrayList;

import br.com.stefanini.projetodois.dto.AccountRequest;
import br.com.stefanini.projetodois.dto.AccountResponse;
import br.com.stefanini.projetodois.model.AccountHolder;
import br.com.stefanini.projetodois.model.AccountManagement;

public class ManagementController {

	private AccountHolder holder;
	private AccountManagement management;
	private AccountRequest request;
	private AccountResponse respose;

	public ManagementController() {

	}

	public ManagementController(AccountHolder holder) {
		super();
		this.holder = holder;

	}

	public AccountHolder getHolder() {
		return holder;
	}

	public AccountHolder adicionarMovimentacao(AccountManagement management) {

		if (holder.getManagements() == null) {
			holder.setManagements(new ArrayList<AccountManagement>());
		}
		if (management.getOperacao().equals("retirada")) {
			if (holder.getSaldo() >= management.getValor()) {
				holder.setSaldo(holder.getSaldo() - management.getValor());
			} else {
				throw new IllegalArgumentException("Operacao não efetuada");
			}
		} else if (management.getOperacao().equals("deposito")) {
			holder.setSaldo(holder.getSaldo() + management.getValor());
		} else {
			throw new IllegalArgumentException("Movimentacao desconhecida");
		}
		holder.getManagements().add(management);
		return holder;
	}

}
