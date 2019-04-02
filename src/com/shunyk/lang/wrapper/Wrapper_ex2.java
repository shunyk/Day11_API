package com.shunyk.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {
	Scanner sc;
	public Wrapper_ex2() {
		sc = new Scanner(System.in);
	}
	
	public void ex1() {
		//주민번호 입력 990122-2123456
		//마지막 번호는 체크용 번호로 따로 저장
		// 9 9 0 1 2 2 - 2 1 2 3 4 5 6
		//*2 3 4 5 6 7   8 9 2 3 4 5 
		//*한 결과를 다 더함
		//더한 결과를 11로 나눈 나머지 구하기
		//나머지를 11로 뺀 값을 체크용 번호와 비교해서 같으면 정상적인 번호 (11-나머지)
		//위의 결과값이 두자리라면 
		//위의 결과값을 10으로 나눈 나머지를 체크번호와 비교
		System.out.println("주민번호 입력");
		String id = sc.next();
		String [] id2 = id.split("-");
		int check = 0;
		int id3[] = new int[id.length()-1];
		for(int i=0; i<id2.length; i++) {
			for(int j=0; j<id2[i].length(); j++) {
				char ch = id2[i].charAt(j);
				id3[check] = Integer.parseInt(String.valueOf(ch));
				check++;
			}
		}
		check = id3[id3.length-1];
		int z=2;
		int sum=0;
		for(int i=0; i<id3.length-1; i++) {
			id3[i] = id3[i] * z;
			z++;
			if(z>9) {
				z=2;
			}
			sum += id3[i];
		}
		z=sum%11;
		if(11-z <10) {
			sum = 11-z;
		}else {
			sum = (11-z)%10;
		}
		if(sum == check) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
	}
	
}
