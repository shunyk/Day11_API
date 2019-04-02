package com.shunyk.util.random;

import java.util.Random;

public class RandomEx1 {

	Random rd;

	public RandomEx1() {
		rd = new Random();
	}

	public void ex1() {
		Random rd = new Random();
		for(int i=0; i<6; i++) {
			int num = rd.nextInt(45)+1;
			System.out.print(num + "\t");
		}
	}

	public void ex2() {
		int [] lotto = new int[6];

		for(int i=0; i<lotto.length; i++) {
			lotto[i] = rd.nextInt(45)+1;

			if(i!=0) {
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {
						while(true) {
							lotto[i] = rd.nextInt(45)+1;
							if(lotto[i]!=lotto[j]) {
								break;
							}
						}
					}else {
						continue;
					}
				}
			}
			System.out.println(lotto[i]);
		}		//	lotto[i] = rd.nextInt(45)+1;
		//	System.out.print(lotto[i] + "\t");
	}


	public void ex3() {
		String [] foods = {"떡볶이", "냉면", "순대국", "육개장", "해장국", "굶기"};
		String menu = foods[rd.nextInt(6)];
		System.out.println(menu);
	}
	
	public void ex4() {
		System.out.println("강화 시작");
		int random = rd.nextInt(10);
		if(random==0) {
			System.out.println("2단계 강화 성공");
		}else if(random>0 && random<3) {
			System.out.println("1단계 강화 성공");
		}else {
			System.out.println("강화 실패");
		}
	}

}
