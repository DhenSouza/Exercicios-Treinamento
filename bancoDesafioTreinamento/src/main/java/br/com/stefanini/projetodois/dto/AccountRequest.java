package br.com.stefanini.projetodois.dto;

import br.com.stefanini.projetodois.model.AccountHolder;
import br.com.stefanini.projetodois.model.AccountManagement;

public class AccountRequest {

	private AccountHolder user;
	private AccountManagement manager;

	public AccountRequest() {

	}

	public AccountRequest(AccountHolder user, AccountManagement manager) {
		super();
		this.user = user;
		this.manager = manager;
	}

	public AccountHolder getUser() {
		return user;
	}

	public void setUser(AccountHolder user) {
		this.user = user;
	}

	public AccountManagement getManager() {
		return manager;
	}

	public void setManager(AccountManagement manager) {
		this.manager = manager;
	}

}
