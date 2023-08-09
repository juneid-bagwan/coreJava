package com.cars;

import java.util.Scanner;

public class mainCar {

	public static void main(String[] args) {
		factoryCar fc = new factoryCar();
		System.out.println("1.to lamborgini\n2.to porshe\n3.to pagani");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		coreCar cc = fc.getcar(a);
		cc.color();
		cc.model();
		s.close();
	}

}

