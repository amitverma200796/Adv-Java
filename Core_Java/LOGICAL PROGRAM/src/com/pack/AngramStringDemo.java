package com.pack;

import java.util.Arrays;

public class AngramStringDemo {

	static boolean isAngram(char str1[],char str2[])
	{
		
	int n1=str1.length;	
	int n2=str2.length;	
		if(n1!=n2)
		 return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<n1;i++)
			if(str1[i]!=str2[i])
				return false;
		return true;
	}
	
	
	public static void main(String[] args) {
		
		char str1[]= {'t','e','s','t'};
		char str2[]= {'t','s','e','t'};
		
		if(isAngram(str1,str2))
			System.out.println("String is Angram");
		else
			System.out.println("String is not Angram");
		
		
	}
	
}
