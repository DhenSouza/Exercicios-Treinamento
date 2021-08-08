package br.com.stefanini.projetodois.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	Connection connect;
	PreparedStatement stmt;
	PreparedStatement stmt1;
	ResultSet rs;

	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtreinamento", "root", "Sei@la.com201");
	}

	public void close() throws Exception {
		connect.close();
	}

}
