package com.shunyk.lang;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Object_1_Object {

	public static void main(String[] args) {
		//Object 클래스의 객체 생성
		//클래스명 참조변수명 = new 생성자()
		Object obj = new Object();
		Object obj2 = new Object();
		//접근지정자 그외지정자 리턴타입 메소드명([매개변수 선언])
		boolean a = obj.equals(obj2);
		System.out.println(a);
		
		String b = obj.toString();
		System.out.println(b);
		
		int c = obj.hashCode();
		System.out.println(c);
		
	}

}
