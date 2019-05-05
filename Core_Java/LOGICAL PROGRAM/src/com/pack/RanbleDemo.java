package com.pack;

public class RanbleDemo {
public static void main(String s[])
{
	Runnable r = () -> {
                
            	System.out.println("hello");
		    
	};

	
	Thread t=new Thread(r);
	t.start();
	 
	
}

}