package com.pack;

import java.util.Scanner;

public class prime {

 public static void main(String[] args) {
    int n;
    int i;
    int flag=1;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Any Enter");
    n=Integer.parseInt(s.nextLine());
    
    for(i=2;i<=n/2;i++)
    {
    	if(n%i==0){
    		
    		flag=0;
    	}
    	
    	
    }
    if(flag==0)
    {
    	System.out.println("number is not prime  "+n);
    	
    }
    else
    {
    	System.out.println("number is prime "+n );
    }
    
 
 
 }
	
		
	}




