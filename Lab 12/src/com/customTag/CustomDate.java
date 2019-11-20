package com.customTag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomDate extends SimpleTagSupport{

	private String color;  
	private int size;
    
	public void setColor(String color) {  
	    this.color = color;  
	}  
	public void setSize(int size) {  
	    this.size = size;  
	}  
	
	public void doTag() throws JspException, IOException{
		JspWriter out = getJspContext().getOut();
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		out.println("<p style=\"color:"+color+"; font-size:"+size+"px;\"> Current Date: " + ft.format(dNow));

	}
}
