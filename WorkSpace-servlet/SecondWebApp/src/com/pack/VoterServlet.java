package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class VoterServlet
 */
public class VoterServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public VoterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		//read username And age
		String userName =request.getParameter("name");
		String userAge=request.getParameter("age");
		int i=Integer.parseInt(userAge);
		//PrintWriter Object creation 
		PrintWriter pw=response.getWriter();
		if(i<18)
			
			{
			pw.println("Hello "+userName);
		    pw.println("Sorry, Not eligible to Vote");
			}
		else
		{
			pw.println("Hello, "+userName);
			pw.println("You are Eligible to vote");
		}
		
    pw.close();		
		
		
	}

}
