package com.shunyk.util.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		//ca2.set(Calendar.MINUTE, 40);
		ca2.add(Calendar.DATE, 2);
		
		long l = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		
		long l3 = l2-l;
		
		System.out.println(l3/(1000*60*60*24));
		
		ca2.set(1999, 1, 22);
		long l4 = ca2.getTimeInMillis();
		System.out.println(l4);
		
		

	}

}
