package edu.mum.cs.cs472.lab11.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.cs.cs472.lab11.daos.Lookup;
import edu.mum.cs.cs472.lab11.model.ContactFormData;


@WebServlet("/SearchPageController")
public class SearchPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("input");
		Lookup look = new Lookup();
		ContactFormData match = look.getFeedback(input);
		request.setAttribute("contactFormData", match);
		RequestDispatcher rd = request.getRequestDispatcher("/SearchResult.jsp");
        rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
