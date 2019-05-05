package com.pack;

public class LargestElement {
public static void main(String[] args) {
	
	int arr[]= {3,44,2,4,4,89,66,122,545};
	int l=arr.length;
	int max=0;
	for(int i=0;i<l;i++)
	{
		if(arr[i]>max)
			max=arr[i];
		
		
	}
	System.out.println(max);
	
}
}
