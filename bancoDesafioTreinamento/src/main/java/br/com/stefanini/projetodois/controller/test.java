package br.com.stefanini.projetodois.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.stefanini.projetodois.dao.AccountHolderDAO;
import br.com.stefanini.projetodois.model.AccountHolder;
import br.com.stefanini.projetodois.model.AccountManagement;

public class test {
	public static void main(String[] args) throws Exception {
		AccountHolderDAO dao = new AccountHolderDAO();

		AccountHolder user = new AccountHolder(null, "denilson", "denilson@gmail.com", 0.,
				UUID.randomUUID().toString());

		AccountManagement operacao1 = new AccountManagement(null, "deposito", 5000.);

		ManagementController controll = new ManagementController(user);

		List<AccountManagement> listaMovimento = new ArrayList<AccountManagement>();

		listaMovimento.add(operacao1);

		user.setManagements(listaMovimento);

		controll.adicionarMovimentacao(operacao1);

		try {
			 int chave = dao.createAccountHolderManagement(user);
			
//			 dao.findAll();
//			 for (AccountHolder u : dao.findAll()) {
//			 System.out.println(u);
//			 }

			System.out.println("Criado com sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
