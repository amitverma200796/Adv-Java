package StarPattern;

import java.util.HashMap;
import java.util.Map;

public class HashMapExp {
	public static void main(String[] args) {
		

	
	Employee emp1=new Employee(101,"Amit");
	Employee emp2=new Employee(101,"Amit");
	Employee emp3=new Employee(101,"Amit");
	
	HashMap<Employee,String> empHashMap=new HashMap<>();	
	empHashMap.put(emp1, "User1");
	empHashMap.put(emp2, "User2");
	empHashMap.put(emp3, "User3");
	for(Map.Entry<Employee, String> entry:empHashMap.entrySet())
	{
		
		System.out.println(entry.getKey()+"==="+entry.getValue());
	}
	
	
}
}