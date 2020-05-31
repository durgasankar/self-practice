package com.bridgeLabz.JDBC.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 * This class has the functionality and implementation of 
 * ResultSetMetaData Interface most used methods.
 * 
 * @author Durgasankar Mishra
 * @created 2019-12-25
 * @version 1.8
 */
public class ResultSetMetaDataExecution {
	/**
	 * The metadata means data about data i.e. we can get further information from
	 * the data.
	 * 
	 * If you have to get metadata of a table like total number of column, column
	 * name, column type etc. , ResultSetMetaData interface is useful because it
	 * provides methods to get metadata from the ResultSet object.
	 * 
	 * Commonly used method of ResultSetMetaData Interface
	 * ***************************************************
	 * 
	 * public int getColumnCount()
	 * it returns the total number of columns in the ResultSet object.
	 * 
	 * public String getColumnName(int index)
	 * it returns the column name of the specified column index.
	 * 
	 * public String getColumnTypeName(int index)
	 * it returns the column type name for the specified index.
	 * 
	 * public String getTableName(int index)
	 * it returns the table name for the specified column index.
	 */
	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgasankar", "root", "@R20jc134");
		String query = "select * from addressBook";
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("Total Column count : " + rsmd.getColumnCount());
		System.out.println("1st column name : " + rsmd.getColumnTypeName(1));
		System.out.println("1st column type" + rsmd.getColumnType(1));
		System.out.println("2st column name : " + rsmd.getColumnTypeName(2));
		System.out.println("2st column type" + rsmd.getColumnType(2));
		System.out.println("3st column name : " + rsmd.getColumnTypeName(3));
		System.out.println("3st column type" + rsmd.getColumnType(3));
		System.out.println("4st column name : " + rsmd.getColumnTypeName(4));
		System.out.println("4st column type" + rsmd.getColumnType(4));

		System.out.println("\nAll data :\n**********");

		while (rs.next()) {
			System.out.println("ID : " + rs.getInt("id") + ", name : " + rs.getString("name") + ", phoneNumber : "
					+ rs.getString("phoneNumber") + ", address : " + rs.getString("address"));
		}

		rs.close();
		ps.close();
		conn.close();
	}

}
