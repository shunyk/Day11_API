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
	
	
	public void setInfo(ArrayList ar) {
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		ar.add(name);
		ar.add(age);
	}

}
