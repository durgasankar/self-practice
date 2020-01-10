package com.bridgeLabz.spring.database.DAO;

import java.util.List;

import com.bridgeLabz.spring.database.model.Contact;

public interface IContactDAOService {
	// Create
	public void save(Contact contact);

	// Read
	public Contact getByName(String name);

	// Update
	public void update(Contact contact);

	// Delete
	public void deleteByName(String name);

	// Get All
	public List<Contact> getAll();
}
