package com.shunyk.lang.string;

import java.util.Scanner;

public class StringEx_1 {

	Scanner sc;

	public StringEx_1() {
		sc = new Scanner(System.in);
	}
	
	public void ex5() {
		System.out.println("업로드할 이미지 파일명 입력");
		String img = sc.next();
		int index = img.indexOf(".");
		String find = img.substring(index+1);
		System.out.println(find);
		if(find.equals("gif") || find.equals("jpg") || find.equals("png")) {
			System.out.println("업로드 완료");
		}else {
			System.out.println("이미지만 업로드 가능합니다.");
		}
	}
	
	public void ex4() {
		System.out.println("아이디 입력");
		String id = sc.next();
		boolean check1 = false;
		boolean check2 = false;
		/*int count = id.length();
		int find = id.indexOf("@");
		if(count >10 && find == -1) {
			System.out.println("10글자 이내로 입력해야하며 이메일 형식이 아님");
		}else if(find == -1) {
			System.out.println("이메일 형식이 아님");
		}else if(count > 10){
			System.out.println("10글자 이내로 입력");
		}else {
			System.out.println("성공");
		}*/
		
		if(id.length() < 11) {
			check1 = true;
		}
		
		int index = id.indexOf("@");
		if(index != -1) {
			check2 = true;
		}
		
		if(check1 && check2) {
			System.out.println("사용 가능 아이디");
		}else {
			System.out.println("사용 불가 아이디");
		}
		
	}
	
	public void ex3() {
		System.out.println("문자열 입력");
		String str = sc.next();
		int pay = str.length()*100;
		System.out.println("가격은 " + pay);
	}

	public void ex2() {
		String name = "Mississippi";
		int count = 0;
		int s = 0;
		while(true) {
			s = name.indexOf("i", s);
			if(s != -1) {
				count++;
				s++;
			}else {
				break;
			}
		}System.out.println("i는" + count + "개입니다");
	}

	public void ex1() {
		System.out.println("주민번호 입력");
		System.out.println("ex)111111-1111111");
		String id = sc.next();
		char gender = id.charAt(7);

		System.out.println(id);

		if(gender==49 || gender==51) {
			System.out.println("남자");
		}else if(gender == 50 || gender==52){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 번호");
		}

		if(gender=='1' || gender=='3') {
			System.out.println("남자");
		}else if(gender == '2' || gender=='4'){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 번호");
		}
	}

}
