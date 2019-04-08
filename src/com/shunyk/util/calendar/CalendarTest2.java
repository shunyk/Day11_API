package com.shunyk.util.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(1999, 0, 22);
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}

}
