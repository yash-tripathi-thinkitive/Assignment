package com.thinkitive.day1.web.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MyConnection {
	Connection con;
	Statement st;
	PreparedStatement ps;

	public MyConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public Connection getDbConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Statement getStatement() {
		try {
			st = this.getDbConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}

	public PreparedStatement getPreparedStatement(String sql) {
		try {
			ps = this.getDbConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
	}
}
