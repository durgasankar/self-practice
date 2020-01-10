package com.bridgeLabz.spring.database.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.bridgeLabz.spring.database.model.Contact;

public class ContactDAOImpl implements IContactDAOService {
	
	private DataSource dataSource;
//	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void save(Contact contact) {
//		System.out.println(dataSource);
		String query = "insert into contacts (name,phoneNumber) values (?,?)";
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = dataSource.getConnection();
//			System.out.println(conn);
			ps = conn.prepareStatement(query);
			ps.setString(1, contact.getName());
			ps.setString(2, contact.getPhoneNumber());
			int affectedRows = ps.executeUpdate();
			if (affectedRows != 0) {
				System.out.println("Contact saved with name : " + contact.getName());
			} else {
				System.out.println("Contact failed to save with name : " + contact.getName());
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

	public Contact getByName(String name) {

		return null;
	}

	public void update(Contact contact) {

	}

	public void deleteByName(String name) {

	}

	public List<Contact> getAll() {

		return null;
	}

}
