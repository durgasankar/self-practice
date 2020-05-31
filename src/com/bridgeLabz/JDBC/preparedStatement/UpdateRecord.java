package com.bridgeLabz.JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * This class has the implementation of update data from database using prepared statement.
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-24
 * @version 1.8
 */

public class UpdateRecord {
/**
 * Methods associated with Driver class 
 * ************************************
 * 
 * public static void registerDriver(Driver driver):	
 * is used to register the given driver with DriverManager.
 * 
 * public static void deregisterDriver(Driver driver):	
 * is used to deregister the given driver (drop the driver from the list) with DriverManager.
 * 
 * public static Connection getConnection(String url):	
 * is used to establish the connection with the specified url.
 * 
 * public static Connection getConnection(String url,String userName,String password):
 * is used to establish the connection with the specified url, username and password.
 * 
 */
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/durgasankar";
		String user = "root";
		String password = "@R20jc134";
		String query = "update addressBook set name = ? where id = ?";
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, "Majnu bhai");
		ps.setInt(2, 8);
		int rowAffected = ps.executeUpdate();
		System.out.println("affected rows : " + rowAffected);

	}
}
