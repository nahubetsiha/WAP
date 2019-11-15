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
 * Servlet Filter implementation class TotalHitFilter
 */
@WebFilter("/*")
public class TotalHitFilter implements Filter {

	public int totalHit;
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		totalHit++;
		request.setAttribute("totalHit", totalHit);
		chain.doFilter(request, response);
	}


}
