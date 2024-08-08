package com.phone;

import java.util.Scanner;

public class MAINosFactory {

	public static void main(String[] args) {
		factory osf=new factory();
		System.out.println("1.to android\n2.to windows\n3.to iphone");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		os myobj=osf.getdata(a);
		myobj.spec();
		s.close();
		
	}

}
