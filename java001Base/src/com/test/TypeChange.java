package com.test;

public class TypeChange {
	     
	    public static void main(String[] args) {
	        int a = 1000;
	    	long b = 20000L;
	    	float c = a;
	    	float d = b;
	    	double e = b;
	    	System.out.println(c);//1000.0
	    	System.out.println(d);//2000.0
	    	System.out.println(e);//2000.0
	    }
}
