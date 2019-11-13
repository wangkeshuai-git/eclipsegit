package com.test;

public class LableContinueStatement {
	public static void main(String[] args) {
	     //带标签break和continue：控制嵌套循环跳转(打印101-150之间所有的质数)
		 outer: for (int i = 101; i < 150; i++) {
	            for (int j = 2; j < i / 2; j++) {
	                if (i % j == 0){
	                    continue outer;
	                }
	            }
	            System.out.print(i + "  ");
	        }
	}
}

