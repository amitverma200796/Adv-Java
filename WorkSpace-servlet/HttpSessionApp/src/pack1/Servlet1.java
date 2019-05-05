package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  //read value
		String fname=request.getParameter("fname");
		//get session object
		HttpSession session =request.getSession();
		//set firstName to session object
		session.setAttribute("fn", fname);
		
		
		//set mime type
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<center>");
		out.println("<form action="+response.encodeURL("srv2")+">");
		out.println("LastName :<input type text name='lname'>");
		out.println("<br>");
		out.println("<input type=submit value='submit'>");
		out.println("</form></center>");
		out.close();
		
		
		
	}

}
