package com.bridgeLabz.JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * This class has the implementation of Insert data to database using prepared statement.
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-24
 * @version 1.8
 */
public class InsertingData {
	/**
	 * Methods associated with Connection Interface
	 * ********************************************
	 * 
	 * 1) public Statement createStatement(): 
	 * creates a statement object that can be used to execute SQL queries.
	 * 
	 * 2) public Statement createStatement(int resultSetType,int resultSetConcurrency):
	 *  Creates a Statement object that will generate ResultSet objects with the given type and concurrency.
	 *  
     * 3) public void setAutoCommit(boolean status):
     *  is used to set the commit status.By default it is true.
     *  
     * 4) public void commit(): 
     * saves the changes made since the previous commit/rollback permanent.
     * 
     * 5) public void rollback(): 
     * Drops all changes made since the previous commit/rollback.
     * 
     * 6) public void close():
     *  closes the connection and Releases a JDBC resources immediately.
	 */
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/durgasankar";
		String user = "root";
		String password = "@R20jc134";
		String query = "insert into addressBook(name, phoneNumber, address) values(?,?,?) ";
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, "Raakeshia");
		ps.setString(2, "1541018522");
		ps.setString(3, "AK");
		int affectedRows = ps.executeUpdate();
		System.out.println("affected " + affectedRows);
//		while (rs.next()) {
//			System.out.println("name : " + rs.getString("name") + ", address : " + rs.getString("address"));
//		}
		ps.close();
		conn.close();
	}

}
