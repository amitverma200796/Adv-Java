package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  //read salary
		int sal=Integer.parseInt(request.getParameter("sal").trim());
		//calculate da 
		double da=sal*0.12;
		//store da in request object
		request.setAttribute("da", da);
		//System.out.println(sal);
		RequestDispatcher rd=request.getRequestDispatcher("srv2");
		rd.forward(request, response);
	}

}
