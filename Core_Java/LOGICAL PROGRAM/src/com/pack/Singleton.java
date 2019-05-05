package com.pack;

public class Singleton {

	private static Singleton singleton;

	public Singleton() {
		
	}
	public static synchronized Singleton getInstance()
	{
		
		
		   if(singleton==null)
		   {
			   singleton =new Singleton();
		   }
			
		return singleton;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
