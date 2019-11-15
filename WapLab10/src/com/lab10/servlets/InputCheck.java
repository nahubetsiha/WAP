package com.lab10.servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/check")
public class InputCheck extends HttpServlet {
	public int successCounter;
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String name = req.getParameter("name");
		String gender = req.getParameter("inlineRadioOptions");
		String category = req.getParameter("category");
		String message = req.getParameter("textarea");
		
		
		HashMap <String, String> empty = new HashMap<>();
		HashMap <String, String> filled = new HashMap<>();
		
		
		if(name == "") {
			empty.put("Name", "Enter a valid name");
		}
		else {
			req.setAttribute("Name", name);
		}
		if(gender == null) {
			empty.put("Gender", "Select a gender");
		}
		else {
			req.setAttribute("Gender", gender);
		}
		if(category == "") {
			empty.put("Category", "Select category");
		}
		else
			req.setAttribute("Category", category);
		if(message == "") {
			empty.put("Message", "Enter response");
		}
		else
			req.setAttribute("Message", message);
		
		if(empty.isEmpty()) {
			successCounter++;
			HttpSession session = req.getSession();
			filled.put("Name", "Name: " + name);
			filled.put("Gender", "Gender: "+gender);
			filled.put("Category", "Category: "+category);
			filled.put("Message", "Message: " + message);
			session.setAttribute("filled", filled);
			session.setAttribute("successCounter", successCounter);
			res.sendRedirect("success.jsp");
		}
		else {

			req.setAttribute("error", empty);
			req.getRequestDispatcher("contactus.jsp").forward(req, res);
		}
	}
}

