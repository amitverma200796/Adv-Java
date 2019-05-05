package com.pack;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString 
{
  public static void main(String[] args) {
	String s="madam";
	char [] ch=s.toCharArray();
	HashMap<Character,Integer> map=new HashMap<>();
	for(int i=0;i<ch.length;i++)
	{
		if(map.containsKey(ch[i]))
		{
			Integer ol=map.get(ch[i]);
			map.put(ch[i], ol+1);
			
		}
		else
			map.put(ch[i],1);
	}
     for(Map.Entry<Character,Integer> mm:map.entrySet())
     {
    	 System.out.println(mm);
     }
  }
}
