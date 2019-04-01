package com.shunyk.lang.string.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherInit wi = new WeatherInit();
		Weather[] weathers = wi.getWethers();
		
		for(int i=0;i<weathers.length;i++) {
			System.out.println("도시명 : " + weathers[i].getCity());
			System.out.println("날씨 : " + weathers[i].getState());
		}
	}

}
