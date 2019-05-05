package com.pack;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExp {
	
	    public static void main(String[] args) 
	    {
	        //Creating HashMap with default initial capacity and load factor
	        
	        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
	        
	        //Inserting key-value pairs to map using put() method
	        
	        map.put("ONE", 1);
	        
	        map.put("TWO", 2);
	        
	        map.put("THREE", 3);
	        
	        map.put("FOUR", 4);
	        
	        map.put("FIVE", 5);
	        
	        //Printing key-value pairs 
	        
	        Set<Entry<String, Integer>> entrySet = map.entrySet();
	        
	        for (Entry<String, Integer> entry : entrySet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	        
	        System.out.println("-------------------------");
	        
	        //Creating another HashMap
	        
	        TreeMap<String, Integer> anotherMap = new TreeMap<String, Integer>();
	        
	        //Inserting key-value pairs to anotherMap using put() method
	        
	        anotherMap.put("SIX", 6);
	        
	        anotherMap.put("SEVEN", 7);
	        
	        //Inserting key-value pairs of map to anotherMap using putAll() method
	        
	        anotherMap.putAll(map);
	        
	        //Printing key-value pairs of anotherMap
	        
	        entrySet = anotherMap.entrySet();
	        
	        for (Entry<String, Integer> entry : entrySet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
	    }    
	}

	
	
	

