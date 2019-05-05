package com.pack;

public class Demo {

	    public static void main(String args[]) {
	        Demo d = new Demo();
	        d.add(10,20);     // to call the non-static method
	    }

	    public void add(int x ,int y) {
	        int a = x;
	        int b = y;
	        int c = a + b;
	        System.out.println("addition " + c);
	    }
	}

