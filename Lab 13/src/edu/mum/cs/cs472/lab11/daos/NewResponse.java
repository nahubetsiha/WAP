package edu.mum.cs.cs472.lab11.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.mum.cs.cs472.lab11.model.ContactFormData;



public class NewResponse {

	OpenConnection connection=null;
	Connection con;
	
	String query = "insert into contacts(customer_name,gender,category,message) values (?,?,?,?)";
	
	public NewResponse() {
		this.connection=OpenConnection.getInstance();
	}
	
	public int addResponse(ContactFormData d) {
		try {
			con=connection.getResource().getConnection();
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, d.getName());
			st.setString(2, d.getGender());
			st.setString(3, d.getCategory());
			st.setString(4, d.getMessage());
			return st.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
		
	}
	
}
