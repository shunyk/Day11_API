package com.shunyk.util.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {
	
	Scanner sc;
	
	public ListTest_1() {
		sc = new Scanner(System.in);
	}
	
	
	public void ex1() {
		//숫자를 입력받아서 - 3
		//해당 숫자 만큼 랜덤한 숫자를 3개 생성해서
		//List에 추가하고 출력
		Random rd = new Random();
		ArrayList ar = new ArrayList();
		
		System.out.println("숫자를 입력");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			int z= rd.nextInt();
			ar.add(z);
		}
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
	
	public void ex2() {
		
	}

}
