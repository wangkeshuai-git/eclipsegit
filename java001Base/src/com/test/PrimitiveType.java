package com.test;

public class PrimitiveType {
	public static void main(String[] args) {
		int a = 15;//15整型常量值，以十进制形式表示，a是整型变量。
		int b = 015;//015整型常量值，以八进制形式表示，b是整型变量。
		int c = 0x15;//0x15整型常量值，以十六进制形式表示，c是整型变量。
		int d = 0b1101;//0b1101整型常量值，以二进制形式表示，d是整型变量。
		
		//30000是int类型整型常量值，salary是long类型变量。
		//在为salary赋值时，最好在30000后加上L或l，防止30000超int类型值范围,编译报错。
		long salary = 30000;
		salary = 30000L;// 30000L是long类型常量值。
	}
}
