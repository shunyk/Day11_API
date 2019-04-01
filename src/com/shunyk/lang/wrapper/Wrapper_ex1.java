package com.shunyk.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	Scanner sc;
	
	public Wrapper_ex1() {
		sc = new Scanner(System.in);
	}
	
	
	public void ex1() {
		int year = 0;
		System.out.println("주민번호 입력");
		String id = sc.next();
		String y = id.substring(0, 2);
		if(y.substring(0, 1).equals("0") || y.substring(0, 1).equals("1")) {
			year = Integer.parseInt(y);
			year+=2000;
			
		}else {
			year = Integer.parseInt(y);
			year+=1900;
		}
		
		System.out.println("나이 : " + (2019-year));
		
		String m = id.substring(2, 4);
		int month = Integer.parseInt(m);
		if (month >= 3 && month <= 5) {
			System.out.println("봄 출생");
		}else if (month >= 6 && month <= 8) {
			System.out.println("여름 출생");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을 출생");
		}else if (month == 12 || month <= 2) {
			System.out.println("겨울 출생");
		}		
	}
}
