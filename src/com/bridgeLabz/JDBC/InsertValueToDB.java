package com.bridgeLabz.JDBC;

import java.sql.*;

public class InsertValueToDB {
	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/durgasankar";
//		String url = "jdbc:mysql://IP:3306/addressbook?autoReconnect=true";
		String userName = "root";
		String password = "@R20jc134";
		String insertQuery = "insert into addressBook(name,phoneNumber,address) values ('Raj',7006500,'balasore')";
//		String fetchedQuery = "select * from addressBook";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st =  con.createStatement();
		int affectedRows = st.executeUpdate(insertQuery);
		System.out.println("Affected " + affectedRows + " rows.");
//		ResultSet rs = st.executeQuery(fetchedQuery);
//		while (rs.next()) {
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			long phoneNumber = rs.getLong("phoneNumber");
//			String address = rs.getString("address");
//			System.out.println("id : " + id + ", name : " + name + ", phoneNumber : " + phoneNumber
//					+ ", address : " + address);
//		}
//
		st.close();
		con.close();
	}

}
