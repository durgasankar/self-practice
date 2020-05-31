package com.bridgeLabz.JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * This class has the implementation of delete data from database using prepared statement.
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-24
 * @version 1.8
 */
public class DeleteRecord {
	/**
	 * Prepared statement interface has following methods
	 * **************************************************
	 * public void setInt(int paramIndex, int value)	sets the integer value to the given parameter index.
	 * 
	 * public void setString(int paramIndex, String value)	sets the String value to the given parameter index.
	 * 
	 * public void setFloat(int paramIndex, float value)	sets the float value to the given parameter index.
	 * 
	 * public void setDouble(int paramIndex, double value)	sets the double value to the given parameter index.
	 * 
	 * public int executeUpdate()	executes the query. It is used for create, drop, insert, update, delete etc.
	 * 
	 * public ResultSet executeQuery()	executes the select query. It returns an instance of ResultSet.
	 */
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/durgasankar";
		String user = "root";
		String password = "@R20jc134";
		String query = "delete from addressBook where id = ?";
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, 5);
		int affectedRows = ps.executeUpdate();
		System.out.println("Affected rows : " + affectedRows);
	}

}
