package edu.mum.cs.cs472.lab11.daos;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class OpenConnection {

	@Resource(lookup = "jdbc/cs472-201911-lesson15-contacts-db")
	private DataSource resource;
	static OpenConnection instance=new OpenConnection();
	
	private OpenConnection() {
		
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			this.resource = (DataSource) envContext.lookup("jdbc/cs472-201911-lesson15-contacts-db");
			System.out.println("connected");
		} catch (NamingException e) {
			System.err.println(e);
		}
	}
	
	public static OpenConnection getInstance() {
		
		return instance;
	}
	
	public DataSource getResource() {
		
		return resource;
	}
	
}
