package com.shunyk.util.sort;

public class Member implements Comparable<Member>{

	private String id;

	private int age;

	public Member(String id, int age) {
		this.id = id;
		this.age = age;

		System.out.println("this : " + this);
	}

	public int compareTo( Member o) {

		int result=0;

		if(this.age<o.getAge()) {
			result=1;
		}else if(this.age>o.getAge()) {
			result=-1;
		}else {
			result = this.id.compareTo(o.getId());

			if(result<0) {
				result = 1;
			}else if(result>0) {
				result = -1;
			}else {
				result = 0;
			}
		}
		return result;
	}	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
