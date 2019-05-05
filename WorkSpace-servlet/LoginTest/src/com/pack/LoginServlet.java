package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LoginServlet() {
        System.out.println("Constructor is called");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method is called");
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service method is called");
		String str1=request.getParameter("uname");
		String str2=request.getParameter("pass");
		
		PrintWriter pw=response.getWriter();
		if(str1.equals("Amit")&&str2.equals("Java"))
		{
			pw.println("Loging Success");
		}
		else
		{
			pw.println("Login is Failled");
		}
		
		
	}
  
	public void destroy()
	{
		System.out.println("destroy is called");
	}
}
