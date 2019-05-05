package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaginationServlet
 */
public class PaginationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    Connection con=null;
    Statement stmt=null;
	public void init(ServletConfig config) throws ServletException {
		
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","amit");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	
		try
		{
			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			//set content type
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			//read page Number from the request ---->1
			int pageNumber=Integer.parseInt(request.getParameter("no"));
			//select record of emp and stores in the scrollable resultset---->2
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=stmt.executeQuery("select * from emp");
			//find Start position --->3
			int start=pageNumber*3-3+1;
			//move cursor to start position --->4
			rs.absolute(start);
			//display record on the page 
			out.println("<center><table border=2>");
			int i=1;
			do
			{
				out.println("<tr>");
				out.println("<td>"+rs.getString(1)+"</td>");
				out.println("<td>"+rs.getString(2)+"</td>");
				out.println("<td>"+rs.getString(3)+"</td>");
				out.println("<td>"+rs.getString(4)+"</td>");
				out.println("</tr>");
				i++;
				
			}while(rs.next()&&i!=4);
			out.println("</table>");
			//find total number of rows---->6
			rs.last();
			int total=rs.getRow();
			//find the number of pages
			int pages=total/3;
			if(total%3!=0)
			{
				pages++;
			}
			if(pageNumber==1)
			{
				int n=pageNumber+1;
				out.println("&nbsp;&nbsp;&nbsp;");
				out.println("<a href=pagination?no="+n+">Next-></a>");
				
			}
			else if(pageNumber==pages)
			{
				int n=pageNumber-1;
				out.println("<a href=pagination?no="+n+"><-Prev</a>");
				
			}
			else
			{
				int n=pageNumber-1;
				out.println("<a href=pagination?no="+n+"><-Prev</a>");
			    
				int n1=pageNumber+1;
			    out.println("&nbsp;&nbsp;&nbsp;");
				out.println("<a href=pagination?no="+n1+">Next-></a>");
			
			
			}
			out.println("</center>");
			out.close();
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
