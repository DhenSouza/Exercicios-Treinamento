package br.com.stefanini.projetodois.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.stefanini.projetodois.controller.ManagementController;
import br.com.stefanini.projetodois.model.AccountHolder;
import br.com.stefanini.projetodois.model.AccountManagement;

public class AccountHolderDAO extends DAO {

	public void createAccountHolder(AccountHolder user) throws Exception {
		open();
		stmt = connect.prepareStatement("insert into accountHolder values(null,?,?,?,?)",
				PreparedStatement.RETURN_GENERATED_KEYS);
		stmt.setString(1, user.getNome());
		stmt.setString(2, user.getEmail());
		stmt.setDouble(3, user.getSaldo());
		stmt.setString(4, user.getUuid());
		stmt.execute();
		stmt.close();

		close();
	}

	public Integer createAccountHolderManagement(AccountHolder user) throws Exception {
		open();
		connect.setAutoCommit(false);
		int chave = 0;

		try {
			stmt = connect.prepareStatement("insert into accountHolder values(null,?,?,?,?)",
					PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, user.getNome());
			stmt.setString(2, user.getEmail());
			stmt.setDouble(3, user.getSaldo());
			stmt.setString(4, user.getUuid());
			stmt.executeUpdate();
			rs = stmt.getGeneratedKeys();
			rs.next();
			chave = rs.getInt(1);
			stmt.close();

			stmt1 = connect.prepareStatement("insert into accountManagement values(null, ?,?,?)");
			for (AccountManagement m : user.getManagements()) {
				stmt1.setString(1, m.getOperacao());
				stmt1.setDouble(2, m.getValor());
				stmt1.setDouble(3, chave);
			}
			stmt1.executeUpdate();
			stmt1.close();

			connect.setAutoCommit(true);

		} catch (Exception ex) {
			connect.rollback();
			throw new Exception(ex.getMessage());
		} finally {
			connect.close();
		}

		return chave;
	}

	public List<AccountHolder> findAll() throws Exception {
		open();
		List<AccountHolder> list = new ArrayList<AccountHolder>();
		stmt = connect.prepareStatement("select * from accountholder");
		rs = stmt.executeQuery();

		while (rs.next()) {
			AccountHolder holder = new AccountHolder(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4),
					rs.getString(5));
			list.add(holder);
		}
		close();
		return list;
	}

}
