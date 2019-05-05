package pack1;

import java.io.IOException;
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     //read search string
		String str=request.getParameter("s");
		String engine=request.getParameter("engine");
		try
		{
			//ifsearch engine is not entred then throw exception
			if(str.trim().length()==0)
			
				throw new Exception();
			//if engine is not select then throw exception 
			if(engine==null)
				throw new Exception();
			//if string entered and engine is select 
			String url="";
			if(engine.equals("google"))
			{
				url="https://www.google.co.in/search?q="+str;
			
		    }
		else if(engine.equals("yahoo"))
		{
			url="https://in.search.yahoo.com/search?p="+str;
		}
		else
		{
			url="https://www.bing.com/search?q="+str;
		}
		//redirect to url
			response.sendRedirect(url);
	}
    catch(Exception e)
		{
    	response.sendRedirect("error.html");
		}
}

}