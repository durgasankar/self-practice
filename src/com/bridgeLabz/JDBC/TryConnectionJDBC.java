package com.bridgeLabz.JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * 1. import package --> java.sql driver
 * 2. load and register driver --> mySql driver com.mysql.jdbc	
 * 3. create Connection --> connection
 * 4. create statement --> statement
 * 5. execute query
 * 6. process the result
 * 7. close the connection
 */

public class TryConnectionJDBC {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/durgasankar?useSSL=false";
		String userName = "root";
		String password = "@R20jc134";
		String query = "select * from addressBook";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			long phoneNumber = rs.getLong("phoneNumber");
			String address = rs.getString("address");
			System.out.println(
					"id : " + id + ", name : " + name + ", phoneNumber : " + phoneNumber + ", address : " + address);
		}

		st.close();
		con.close();

	}

}
