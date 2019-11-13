package com.test;

public class operator2 {
	     
	    public static void main(String[] args) {
	    	byte a = 12;
	    	short b = 12;
	    	//short c = a+b;
	    	int d = a+b;//操作数全为short，byte，结果也是int
	    	
	    	//int e = d + 123L;
	    	long f = d + 123L;//两个操作数有一个为long, 则结果也为long
	    	
	    	int m = 3;
	    	int n = ++m;//先加1在赋值。n为4
	    	int j = m++;//先赋值，在加1。j为4
	    	System.out.println(n);
	    	System.out.println(j);
	    }
}
