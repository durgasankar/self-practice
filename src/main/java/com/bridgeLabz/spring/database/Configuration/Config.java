package com.bridgeLabz.spring.database.Configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bridgeLabz.spring.database.DAO.ContactDAOImpl;
import com.bridgeLabz.spring.database.DAO.IContactDAOService;

@ComponentScan("com.bridgeLabz.spring.database")
@ComponentScan("org.springframework.jdbc.datasource.DriverManagerDataSource")
@Configuration
public class Config {

	@Bean
	public DataSource getDataSource() {
		return new DriverManagerDataSource();
	}

	@Bean
	public IContactDAOService getDAOService() {
		return new ContactDAOImpl();
	}

}
