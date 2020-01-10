package com.bridgeLabz.spring.database.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.bridgeLabz.spring.database.model.Contact;

@Component
public class ContactDAOImpl implements IContactDAOService {
	@Autowired
	private DataSource dataSource;
//	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * using dataSource present in javax.sql.DataSource
	 */
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

	/**
	 * This function is using spring functionality of JDBC where
	 */
	public void update(Contact contact) {

		String query = "update contacts set phoneNumber = ? where name = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { contact.getPhoneNumber(), contact.getName() };
		int affectedRows = jdbcTemplate.update(query, args);
		if (affectedRows != 0) {
			System.out.println("Contact saved with name : " + contact.getName());
		} else {
			System.out.println("Contact failed to save with name : " + contact.getName());
		}

	}

	public void deleteByName(String name) {

	}

	/**
	 * All records collected from database and stored in an arrayList.
	 */
	public List<Contact> getAll() {
		String query = "select * from contacts";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Contact> contactList = new ArrayList<Contact>();

		List<Map<String, Object>> contactRows = jdbcTemplate.queryForList(query);

		for (Map<String, Object> empRow : contactRows) {
			Contact emp = new Contact();
			emp.setName(String.valueOf(empRow.get("name")));
			emp.setPhoneNumber(String.valueOf(empRow.get("phoneNumber")));
			contactList.add(emp);
		}
		return contactList;
	}

}
