package com.test;

public class NestedLoop {
	public static void main(String[] args) {
		 for (int i = 1; i < 10; i++) { // i是一个乘数
	            for (int j = 1; j <= i; j++) { // j是另一个乘数
	                System.out.print(j + "*" + i + "=" + (i * j < 10 ? (" " + i * j) : i * j) + "  ");
	            }
	            System.out.println();
	       }
		 //用while循环或其他循环输出1-1000之间能被5整除的数，且每行输出5个。
		for(int i = 0;i<=1000;i++) {
			if(i%5==0) {
				System.out.print(i+"\t");
			}
			if(i%25==0) {
				System.out.println();
			}
		}
	}
}
