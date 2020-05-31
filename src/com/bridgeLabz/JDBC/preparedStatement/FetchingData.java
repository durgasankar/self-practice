package com.bridgeLabz.JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * This class has the implementation of Fetching data to database using prepared statement.
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-24
 * @version 1.8
 */
public class FetchingData {
	/**
	 * Methods associated with ResultSet Interface
	 * *********************************
	 * 1) public boolean next():	
	 * is used to move the cursor to the one row next from the current position.
	 * 
	 * 2) public boolean previous():	i
	 * s used to move the cursor to the one row previous from the current position.
	 * 
	 * 3) public boolean first():	
	 * is used to move the cursor to the first row in result set object.
	 * 
	 * 4) public boolean last():	
	 * is used to move the cursor to the last row in result set object.
	 * 
	 * 5) public boolean absolute(int row):
	 * 	is used to move the cursor to the specified row number in the ResultSet object.
	 * 
	 * 6) public boolean relative(int row):	
	 * is used to move the cursor to the relative row number in the ResultSet object, it may be positive or negative.
	 * 
	 * 7) public int getInt(int columnIndex):
	 * 	is used to return the data of specified column index of the current row as int.
	 * 
	 * 8) public int getInt(String columnName):	
	 * is used to return the data of specified column name of the current row as int.
	 * 
	 * 9) public String getString(int columnIndex):	
	 * is used to return the data of specified column index of the current row as String.
	 * 
	 * 10) public String getString(String columnName):	
	 * is used to return the data of specified column name of the current row as String.	
	 */
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/durgasankar";
		String user = "root";
		String password = "@R20jc134";
		String query = "select name,address from addressBook where id = ?";
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, 6);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println("name : " + rs.getString("name") + ", address : " + rs.getString("address"));
		}
		ps.close();
		conn.close();
	}

}
