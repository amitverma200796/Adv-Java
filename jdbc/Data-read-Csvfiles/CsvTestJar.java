//CsvTest.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CsvTestJar
 {

	public static void main(String[] args) throws Exception
	{
		
		 Class.forName("org.relique.jdbc.csv.CsvDriver");
		Connection	con=DriverManager.getConnection("jdbc:relique:csv:E:/Text");
		
	    Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from user");
		while(rs.next())
		{
			System.out.println("First Name :"+rs.getString(1));
			System.out.println("Second Name :"+rs.getString(2));
			System.out.println("Mo number  :"+rs.getString(3));
			
		}
         rs.close();	
		 stmt.close();
		 con.close();
	}
 }