package com.bridgeLabz.JDBC.preparedStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bridgeLabz.utility.Util;

/**
 * Implementation of TCL language of mySql database which gives the access to
 * the user to commit or rollBack operation after inserting particular data to
 * the database.
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-25
 * @version 1.8
 */
public class TCLEcecution {
	public static void main(String[] args) throws SQLException, IOException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasankar", "root", "@R20jc134");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			// stopping auto save
			conn.setAutoCommit(false);
			String query = "insert into addressBook(name,phoneNumber,address) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			System.out.println("Enter name :");
			String name = br.readLine();
			ps.setString(1, name);
			System.out.println("Enter phoneNumber :");
			String phoneNumber = br.readLine();
			ps.setString(2, phoneNumber);
			System.out.println("Enter address :");
			String address = br.readLine();
			ps.setString(3, address);
			int affectedRows = ps.executeUpdate();
			System.out.println("1 -> commit/ 2 -> rollback");
			int action = Util.scanner.nextInt();
			if (action == 1) {
				conn.commit();
				System.out.println(affectedRows + " row/s affected.");
				System.out.println("saved successfully.");
			}
			if (action == 2) {
				conn.rollback();
				System.out.println("Inserted data did not updated to database.");
			}

			System.out.println("Do you want to insert more data : (y/n)");
			String answer = br.readLine();
			if (answer.equalsIgnoreCase("n")) {
				System.out.println("\nThank you visit again");
				break;
			}

		} while (true);
	}

}
