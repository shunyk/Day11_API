package com.shunyk.util.calendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalendarTest4 {

	public static void main(String[] args) {
		Calendar in = Calendar.getInstance();
		Calendar out = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("종료시간을 입력");
		String time = sc.next();	//3-50
		String [] times = time.split("-");
		out.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[0]));
		out.set(Calendar.MINUTE, Integer.parseInt(times[1]));
		long inTime = in.getTimeInMillis();
		long outTine = out.getTimeInMillis();
		long result = outTine-inTime;
		long h = result/(1000*60*60);
		long m = result%(1000*60*60);
		System.out.println(h);
		if(m>0) {
			h++;
		}
		System.out.println("최종 요금 : " + h*1000);
		//시간당 1000

	}

}
