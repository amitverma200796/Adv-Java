package com.pack;

public class StringPolindrome {
    public static void main(String[] args) {
		
    	
	
	String str="nitin";
	StringBuilder sb=new StringBuilder(str);
	 sb.reverse();
	String rev=sb.toString();
	if(str.equals(rev))
	{
		System.out.println("STring is Polindrom");
	}
	else
	System.out.println("String is not a polindrom");
	
    }
	
	
}
