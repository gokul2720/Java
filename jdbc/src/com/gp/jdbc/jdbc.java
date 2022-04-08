package com.gp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	
public static void main(String[] args) {
	try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp","root","2720");
		Statement createStatement = connection.createStatement();
		boolean execute= createStatement.execute("create table test1(id int)");
		System.out.println(execute);
	}catch (SQLException e) {
		e.printStackTrace();
	}
}
}
