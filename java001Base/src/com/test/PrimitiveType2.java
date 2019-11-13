package com.test;

import java.math.BigDecimal;
import java.net.StandardSocketOptions;

public class PrimitiveType2 {
	public static void main(String[] args) {
		float a = 15.2f;//15.2f是浮点型常量值，十进制表示方式，a是浮点型变量。
		float b = 15.2e2f;//15.2e2f是浮点型常量值，科学计数法表示方式，b是浮点型变量。
		double c = 15.2;//15.2是浮点型常量值，十进制表示方式，c是浮点型变量。
		double d = 15.2e2;//15.2e2是浮点型常量值，科学计数法表示方式，d是浮点型变量。
		
		double e = 15.2;//15.2默认是double类型的浮点型常量值。
		double f = 15.2D;//5.2D是double类型的浮点型常量值。
		
		System.out.println(a == c);//false,浮点型不适合比较大小,比较是采用BigDecimal
		BigDecimal m = BigDecimal.valueOf(a);
		BigDecimal n = BigDecimal.valueOf(e);
		System.out.println(m.compareTo(n));
		char cc = '\u0061';
		System.out.println(cc);
		char c1 = 97;
		System.out.println(c1);
		
		
	}
}
