package com.pack;

import java.util.HashMap;
import java.util.Iterator;

public class StrringDuplicate {

public void findDuplicateString(String str)
{
	HashMap<String,Integer> hm=new HashMap<>();
	
	String s[]=str.split(" ");
    
	for (String tempString : s)
	{
		if(hm.get(tempString)!=null)
		{
			hm.put(tempString, hm.get(tempString)+1);
		}
		else
		{
			hm.put(tempString, 1);
		}
	}
	Iterator<String> itr=hm.keySet().iterator();
    while(itr.hasNext())
    {
    	String temp=itr.next();
    	if(hm.get(temp)>1)
    	
    	{
    	System.out.println("duplicate word in string "+temp+" number of times "+hm.get(temp));	
    	}
    	
    }

}
    public static void main(String[] args) {
    StrringDuplicate sd=new StrringDuplicate();
	sd.findDuplicateString("I am Learning java java am");
	
	
}
}