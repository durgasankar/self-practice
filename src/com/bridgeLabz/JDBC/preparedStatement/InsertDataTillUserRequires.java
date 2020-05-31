package com.bridgeLabz.JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bridgeLabz.utility.Util;

/**
 * This class allows the user to input data till the time he does not wants to
 * quit. all the data were inserted to the database.
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-25
 * @version 1.8
 */
public class InsertDataTillUserRequires {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasankar", "root", "@R20jc134");
//		String query = "insert into addressBook(name,phoneNumber,address) values (?,?,?)";
//		PreparedStatement st = conn.prepareStatement(query);
//		System.out.println("please Enter name :");
//		String name = Util.scanner.next();
//		Util.scanner.nextLine();
//		st.setString(1, name);
//		System.out.println("please Enter PhoneNumber :");
//		String phoneNumber = Util.scanner.next();
//		Util.scanner.nextLine();
//		st.setString(2, phoneNumber);
//		System.out.println("please Enter address :");
//		String address = Util.scanner.next();
//		Util.scanner.nextLine();
//		st.setString(3, address);
		int affectedRows;
//		int count = 1;
		do {
			String query = "insert into addressBook(name,phoneNumber,address) values (?,?,?)";
			PreparedStatement st = conn.prepareStatement(query);
			System.out.println("please Enter name :");
			String name = Util.scanner.nextLine();
			Util.scanner.nextLine();
			st.setString(1, name);
			System.out.println("please Enter PhoneNumber :");
			String phoneNumber = Util.scanner.next();
			Util.scanner.nextLine();
			st.setString(2, phoneNumber);
			System.out.println("please Enter address :");
			String address = Util.scanner.next();
			Util.scanner.nextLine();
			st.setString(3, address);
			affectedRows = st.executeUpdate();
			System.out.println(affectedRows + " row/s affected.");
			st.close();
			System.out.println("Do you want to continue -> y/n");
			String userInput = Util.scanner.next();
			Util.scanner.hasNextLine();
			if (userInput.equalsIgnoreCase("n")) {
				System.out.println("Thank you visit again");
				break;
			}
		} while (true);
//		st.close();
		conn.close();

	}

}
