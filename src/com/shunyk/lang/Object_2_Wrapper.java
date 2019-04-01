package com.shunyk.lang;

public class Object_2_Wrapper {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.SIZE);
		
		Integer integer = new Integer(10);
		Integer integer2 = new Integer("20");
		
		int num = integer2.intValue();
		System.out.println(num*2);
		
		String num1 = "3.2";
		Double d = new Double(num1);
		double d1 = d.doubleValue();
		System.out.println(d1);
		
		

	}

}
