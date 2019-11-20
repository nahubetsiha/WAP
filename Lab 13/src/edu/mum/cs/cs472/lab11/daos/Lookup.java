package edu.mum.cs.cs472.lab11.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.mum.cs.cs472.lab11.model.ContactFormData;



public class Lookup {

	OpenConnection connection=null;

	Connection con;
	String query="select * from contacts where customer_name=?";
	
	public Lookup() {
		
		this.connection=OpenConnection.getInstance();
	}
	
	public ContactFormData getFeedback(String input) {
		ContactFormData data = new ContactFormData();
		
		try {
			con=connection.getResource().getConnection();
			
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setString(1, input);
			
			
			ResultSet rs=stmt.executeQuery();
			if(rs.next()) {
				
			data.setName(rs.getString("customer_name"));
			data.setGender(rs.getString("gender"));
			data.setCategory(rs.getString("category"));
			data.setMessage(rs.getString("message"));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
}
