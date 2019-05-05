package com.pack;

public class TreversZeroInArr {
       
	static void pushZeroToEnd(int arr[],int n)
	{   
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
				
				
			}
			
			
		}
		while(count<n)
			arr[count++]=0;
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,88,7,66,45,2,0,0,77,1,22,0,5,0};
		int n=arr.length;
		pushZeroToEnd(arr,n);
		
		System.out.println("After trevers");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	
	
}
