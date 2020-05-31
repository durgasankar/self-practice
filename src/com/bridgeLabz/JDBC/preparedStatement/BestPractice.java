package com.bridgeLabz.JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class has the implementation of best practice to use database programs
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-27
 * @version 1.8
 */
public class BestPractice {

	private static final String DB_NAME = "durgasankar";
	private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/" + DB_NAME;
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "@R20jc134";
	private static final String TABLE_NAME = "contacts";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_NUMBER = "phoneNumber";

	private Connection conn;

	public boolean open() {
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
			return true;
		} catch (SQLException e) {
			System.out.println("could not connect to database " + e.getMessage());
			return false;
		}
	}
	
	public void close() {
		try {
			if(conn != null) {
				conn.close();
			}
			
		} catch (SQLException e) {
			System.out.println("could not close connection " + e.getMessage());
		}
	}
	

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
			Statement st = conn.createStatement();
			st.execute("drop table if exists " + TABLE_NAME);
			st.execute("create table if not exists " + TABLE_NAME + " (" + COLUMN_NAME + " varchar(50), "
					+ COLUMN_NUMBER + " varchar(20))");
			String addQuery = "insert into " + TABLE_NAME + " (" + COLUMN_NAME + "," + COLUMN_NUMBER + ") values (?,?)";
			PreparedStatement ps = conn.prepareStatement(addQuery);
			ps.setString(1, "raja");
			ps.setString(2, "7504147446");
			int affectedRows = ps.executeUpdate();

			System.out.println(affectedRows + " row/s affected.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//alternate way
		BestPractice practice = new BestPractice();
		if(!practice.open()) {
			System.out.println("can not open database.");
			return;
		}
		practice.close();
	}
}
