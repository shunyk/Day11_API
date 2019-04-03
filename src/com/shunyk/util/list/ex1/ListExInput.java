package com.shunyk.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExInput {
	private Scanner sc;
	private ArrayList ar;
	
	public ListExInput() {
		sc = new Scanner(System.in);
		ar = new ArrayList();
	}
	
	
	public void setInfo(ArrayList<Member> ar) {
		Member member = new Member();
		System.out.println("이름 입력");
		String name = sc.next();
		member.setName(name);
		System.out.println("나이 입력");
		int age = sc.nextInt();
		member.setAge(age);
		
		ar.add(member);
	}

}
