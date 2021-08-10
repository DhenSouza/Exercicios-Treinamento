package br.com.stefanini.projetoprojetorel.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO implements IDAO{

	Connection connect;
	PreparedStatement stmt;
	PreparedStatement stmt1;
	ResultSet rs;

	@Override
	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdcinco", "root", "Sei@la.com201");
	}

	@Override
	public void close() throws Exception {
		connect.close();
	}

}
