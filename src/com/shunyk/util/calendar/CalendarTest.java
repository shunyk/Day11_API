package com.shunyk.util.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//추상클래스 new 생성 금지
		//현재 시간을 담음
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		//특정한 날짜 데이터를 꺼낼때, get
		int year = cal.get(cal.YEAR);
		System.out.println(year);
		int minute = cal.get(cal.MINUTE);
		System.out.println(minute);
		int month = cal.get(cal.MONTH)+1;
		System.out.println(month);
		int day = cal.get(cal.DATE);
		System.out.println(day);
		
		cal.set(cal.YEAR, 2100);
		System.out.println(cal.get(cal.YEAR));
		cal.set(cal.MONTH, 0);
		System.out.println(cal.get(cal.MONTH));
		
		cal.set(cal.HOUR_OF_DAY, 22);
		System.out.println(cal.get(cal.HOUR));
		System.out.println(cal.get(cal.HOUR_OF_DAY));
		
		cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//int d = cal.get(Calendar.DATE)+3;
		//cal.set(Calendar.DATE, d);
		System.out.println("MONTH : " + cal.get(Calendar.MONTH));
		cal.add(Calendar.DATE, 28);
		System.out.println(cal.get((Calendar.DATE)));
		System.out.println("MONTH : " + cal.get(Calendar.MONTH));
		
	}

}
