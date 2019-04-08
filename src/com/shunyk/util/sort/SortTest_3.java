package com.shunyk.util.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortTest_3 {

	public static void main(String[] args) {
		
		Member member = new Member("choa", 20);
		System.out.println("객체 주소: " + member);
		Member member2 = new Member("choa", 20);
		System.out.println("객체 주소: " + member2);
		
		System.out.println(member == member2);
		System.out.println(member.equals(member2));
		
		ArrayList<Member> ar = new ArrayList<Member>();
		Collections.sort(ar);
	}
	
	public static void sort(List<Comparable<Object>> comparables) {
		
	}

}
