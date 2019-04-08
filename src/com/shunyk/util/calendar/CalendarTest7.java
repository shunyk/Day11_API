package com.shunyk.util.calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest7 {

	public static void main(String[] args) throws ParseException {
		String now = "2020-05-05";
		
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(now);
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		System.out.println(c.get(Calendar.MONTH));
		
	}

}
