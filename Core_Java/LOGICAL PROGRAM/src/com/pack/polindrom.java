package com.pack;

public class polindrom {

	public static void main(String[] args) {
		
		int num=1221;
		int oNum=num;
		int rem;
		int revers=0;
		while(num!=0) {
			
		
		rem=num%10;
		revers=revers*10+rem;
		num=num/10;
		}
		
		if(revers==oNum)
			System.out.println("number is polindrom "+revers);
		else
		{
			System.out.println("not polindrom "+oNum);
		}
	}
		
	
	
}
