package com.phone;

public class factory {

	public os getdata(int a) {
		if(a==1) {
			return new android();
		}
		else if(a==2) {
			return new windows();
		}
		else if(a==3) {
			return new iphone();
		}
		else {
			System.out.println("type someting ");
		}
		return null;
	}
}
