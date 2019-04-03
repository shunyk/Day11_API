package com.shunyk.util.list.ex1;

import java.util.ArrayList;

public class ListExView {
	
	public void view(ArrayList ar) {
		for(int i=0; i<ar.size(); i+=2) {
			System.out.println("이름 : " + ar.get(i));
			System.out.println("나이 : " + ar.get(i+1));
			System.out.println("=============");
		}
	}
	
}
