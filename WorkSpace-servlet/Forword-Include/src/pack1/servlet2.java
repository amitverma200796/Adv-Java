package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //read salary
		int sal=Integer.parseInt(request.getParameter("sal").trim());
	    //read da
		double da=(Double)request.getAttribute("da");
	    //calculate hra
		double hra=sal*0.24;
		//set mime type 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//include response of header servlet
		RequestDispatcher rd=request.getRequestDispatcher("header");
		rd.include(request, response);
		
		out.println("<hr>");
		out.println("<center>");
		out.println("Salary :"+sal);
		out.println("<br>");
		
		out.println("Da :"+da);
		out.println("<br>");
		
		out.println("Hra :"+hra);
		out.println("</center>");
		out.println("<hr>");
		
		//include response of footer servlet
		RequestDispatcher rd2=request.getRequestDispatcher("footer");
		rd2.include(request, response);
		out.close();
		
		
		
	}

}
