package com.shunyk.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {

	public static void main(String[] args) {
		//1. 정보 입력
		//	  이름 입력
		//	  나이 입력
		//2. 정보 출력
		//	  모든 정보 출력
		//3. 종료
		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList();
		ListExInput li = new ListExInput();
		ListExView lv = new ListExView();

		int select = 0;
		boolean check = true;
		do {
			System.out.println("원하는 번호 선택");
			System.out.println("1번 정보 입력");
			System.out.println("2번 정보 출력");
			System.out.println("3번 종료");
			select = sc.nextInt();

			switch(select) {
			case 1:
				li.setInfo(ar);
				break;
			case 2:
				lv.view(ar);
				break;
			case 3:
				check = !check;
				System.out.println("종료");
				break;
			}


		}while(check);

	}

}
