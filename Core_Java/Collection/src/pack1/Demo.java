package pack1;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		Emp ee=new Emp();
		
		LinkedList ll=ee.getEmployeeDetails();
		ee.dispEmployee(ll);
		
		
	}

}
