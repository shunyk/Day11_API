package com.shunyk.util.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(2019, 3 , 1);
		int max = ca.getActualMaximum(Calendar.DATE);
		
		int a = ca.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(max);
		
		System.out.println("일 \t월 \t화 \t수\t목\t금\t토");


		if(a != 0) {
			for(int j=1; j<a; j++) {
				System.out.print("\t");
			}
		}
		for(int i=1; i<=max; i++) {
			
			System.out.print(i+"\t");
			if((i+a-1)%7 == 0) {
				System.out.println();
			}
		}
		
		

	}

}
