package com.shunyk.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	Scanner sc;

	public Wrapper_ex1() {
		sc = new Scanner(System.in);
	}


	public void ex2() {
		System.out.println("비밀번호 입력");
		String pw = sc.nextLine();
		int count = 0;
		boolean upper = false;
		boolean lower = false;
		boolean digit = false;
		boolean space = false;
		
		count = pw.length();
		if(count >= 6) {
			for(int i=0; i<count; i++) {
				char pw2 = pw.charAt(i);
				if(Character.isUpperCase(pw2) == true) {
					upper = true;
				}else if(Character.isLowerCase(pw2) == true) {
					lower = true;
				}else if(Character.isDigit(pw2) == true) {
					digit = true;
				}else if(Character.isWhitespace(pw2) == true) {
					space = true;
				}
			}
			if(upper == false || lower == false || digit == false || space == true) {
				System.out.println("비밀번호 입력 실패");
			}else {
				System.out.println("비밀번호 입력 성공");
			}
			
			
		}else {
			System.out.println("최소 6자 이상 입력");
		}
		

	}

	public void ex1() {
		int year = 0;
		System.out.println("주민번호 입력");
		String id = sc.next();
		String y = id.substring(0, 2);
		if(id.substring(7, 8).equals("3") || id.substring(7, 8).equals("4")) {
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
		}else {
			System.out.println("겨울 출생");
		}		
	}
}
