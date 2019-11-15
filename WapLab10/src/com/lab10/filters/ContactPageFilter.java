package com.lab10.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ContactPageFilter
 */
@WebFilter(urlPatterns= {"/contactus.jsp", "/check"})
public class ContactPageFilter implements Filter {

	public int contactPageCounter;
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		contactPageCounter++;
		request.setAttribute("contactPageCounter", contactPageCounter);
		chain.doFilter(request, response);
	}


}
