package com.pack;

import java.util.Scanner;

public class MergeToArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr1[]=new int[5];
		int arr2[]=new int[5];
		int arr3[]=new int[arr1.length+arr2.length];
	
		int count=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter Any Number for first list");
			arr1[i]=s.nextInt();
			
			System.out.println("Enter Any Number for Second list");
			arr2[i]=s.nextInt();
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("first List "+arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Second list "+arr2[i]);
		}
	
	 for(int j=0;j<arr1.length;j++)
		 arr3[count++]=arr1[j];
	 for(int k=0;k<arr2.length;k++)
	 {
		 arr3[count++]=arr2[k];
	 }
	
	
	 for(int i=0;i<arr3.length;i++)
		{
			System.out.print(" "+arr3[i]);
		}
	
	
	
	}
	
	
	
	
	
	
}
