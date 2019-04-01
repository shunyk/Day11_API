package com.shunyk.lang.string.ex1;

public class WeatherInit {
	private String info;
	
	public WeatherInit() {
		info = "seoul ,맑음 ,10 ,20 , 0.3, daejon, 비, -22, 50, 0.1,"
				+ "incheon ,태풍 ,56 ,90 ,22.2 , jeju, 흐림, 15, 10, 1.2";
	}
	
	public Weather[] getWethers() {
		String[] ar=info.split(",");
		Weather[] weathers = new Weather[ar.length/5];
		int count=0;
		for(int i=0; i<ar.length; i++) {
			Weather w = new Weather();
			w.setCity(ar[i]);
			w.setState(ar[++i]);
			w.setTem(ar[++i]);
			w.setHum(ar[++i]);
			w.setMise(ar[++i]);
			weathers[count]=w;
			count++;
		}
		
		/*for(int i=0; i<ar.length; i=i+5) {
			Weather w = new Weather();
			w.setCity(ar[i]);
			w.setState(ar[i+1]);
			w.setTem(ar[i+2]);
			w.setHum(ar[i+3]);
			w.setMise(ar[i+4]);
			weathers[count]=w;
			count++;
		}*/
		
		return weathers;
		
	}
}
