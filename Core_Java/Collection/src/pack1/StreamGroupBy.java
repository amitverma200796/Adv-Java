package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupBy {
	public static void main(String args[])
	{
	Department e1=new Department("HR",40000);
	Department e2=new Department("Sales",10000);
	Department e3=new Department("HR",60000);
	Department e4=new Department("Production",30000);
	Department e5=new Department("Sales",80000);
	Department e6=new Department("HR",50000);
	Department e7=new Department("Finnance",80000);
	Department e8=new Department("HR",90000);
	Department e9=new Department("Sales",4000);
	Department e10=new Department("HR",1000);
   List<Department> empList=new ArrayList<>();
         empList.add(e1);
         empList.add(e2);
         empList.add(e3);
         empList.add(e4);
         empList.add(e5);
         empList.add(e6);
         empList.add(e7);
         empList.add(e8);
         empList.add(e9);
         empList.add(e10);
    Map<String,Integer> result= empList.stream().collect(Collectors.groupingBy(Department::getDname,Collectors.summingInt(Department::getPrice)));    
	 System.out.println("Result========"+result);
	}
}
