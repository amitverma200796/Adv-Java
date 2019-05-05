package pack1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Emp {

	public LinkedList getEmployeeDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter emp no");
	    int eno=Integer.parseInt(s.nextLine());
	    System.out.println("Enter emp name");
	    String name =s.nextLine();
	    System.out.println("Enter Employee Salary");
	    int sal=Integer.parseInt(s.nextLine());
	    LinkedList ll=new LinkedList();
	    ll.add(eno);
	    ll.add(name);
	    ll.add(sal);
	    return ll;
	
	}
	 
	public void dispEmployee(LinkedList x)
	{
		System.out.println("------------------");
		System.out.println("Employee Data");
		ListIterator ltr=x.listIterator();
		while(ltr.hasNext())
		{
			Object ob=ltr.next();
			System.out.println(ob);
		}
	System.out.println("------------------------");	
	}
}
