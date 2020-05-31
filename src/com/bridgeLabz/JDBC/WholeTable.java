package com.bridgeLabz.JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class WholeTable {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/durgasankar";
		// "jdbc:databaseName://serverName:portId/dataBaseName"
		String userName = "root";
		// UserName of database
		String password = "@R20jc134";
		// password of database
		String query = "select * from addressBook";
		// query which needed to be executed

		// getting the class from particular package
//		Class.forName("com.mysql.jdbc.Driver");

		// establishing the connection by using URL, userName, password
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("id : " + rs.getInt("id") + ", name : " + rs.getString("name") + ", mobile : "
					+ rs.getString("phoneNumber") + ", address : " + rs.getString("address"));
		}

	}

}
