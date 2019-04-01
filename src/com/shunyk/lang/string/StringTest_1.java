package com.shunyk.lang.string;

import java.util.Comparator;

public class StringTest_1 {

	public static void main(String[] args) {
		StringEx_1 se1 = new StringEx_1();
		String s1 = "iu";
		String s2 = "iu";
		String s3 = new String("iu");
		String s4 = new String("iu");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		String str = "choa";
		char ch = str.charAt(2);
		System.out.println(ch);
		
		String s = "hellow world";
		
		int a = s.lastIndexOf("l");
		System.out.println(a);
		
		//se1.ex1();
		//se1.ex2();
		
		String r = s.substring(3, 6);
		System.out.println(r);
	}

}
