package com.shunyk.util.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest_1 {

	public static void main(String[] args) {
		int[] ar = new int[6];
		String [] s = new String[3];
		
		s[0] = "bear";
		s[1] = "apple";
		s[2] = "ant";
		
		Random r = new Random();
		
		for(int i=0; i<ar.length; i++) {
			ar[i]=r.nextInt(45)+1;
			System.out.print(ar[i] + "\t");
		}
		System.out.println();
		
		
		Arrays.sort(ar);
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}
		System.out.println();
		for(int i=0; i<s.length; i++) {
			ar[i]=r.nextInt(45)+1;
			System.out.print(s[i] + "\t");
		}
		System.out.println();
		
		
		Arrays.sort(s);
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i] + "\t");
		}

	}

}
