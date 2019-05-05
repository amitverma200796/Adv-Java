package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	private String driverClassName,driverUrl,userName,password;
	public void init(ServletConfig config) throws ServletException {
		
		driverClassName=config.getInitParameter("p1");
		driverUrl=config.getInitParameter("p2");
		userName=config.getInitParameter("p3");
		password=config.getInitParameter("p4");
				
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set mime type
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//read table name frome request
		String tablename=request.getParameter("s");
		try
		{
			Class.forName(driverClassName);
			Connection con=DriverManager.getConnection(driverUrl,userName,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from "+tablename);
			ResultSetMetaData rsmd=rs.getMetaData();
			//get column count in resultset
			int count =rsmd.getColumnCount();
			pw.println("<center>");
			pw.println("<table border=2 bgcolor=yellow>");
			//first row which cantains column name as headline
			pw.println("<tr>");
			for(int i=1;i<=count;i++)
			{
				pw.println("<th>"+rsmd.getColumnName(i)+"</th>");
				
			}
			pw.println("</tr>");
			//print data of the column from resultset
			while(rs.next())
			{
				pw.println("<tr>");
				for(int k=1;k<=count;k++)
				{
				pw.println("<td>"+rs.getString(k)+"</td>");	
				}
				pw.println("</tr>");
				
				
			}
			pw.println("</table></center>");
			rs.close();
			stmt.close();
			con.close();
			pw.println("<br>");
			pw.println("<a href=index.html>Click Here</a>");
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
