package assignment1;

import java.util.Scanner;
import java.util.TreeMap;

public class Bank {
	static long balance = 10000;

	static void inquiry() {
		System.out.println("remaining balance is " + balance);
	}

	static void deposit(long a) {
		balance = balance + a;
		System.out.println("amount deposited successfully....");
		inquiry();
	}

	static void withdraw(long a) {
		balance = balance - a;
		System.out.println("amount withdraw successfully....");
		inquiry();
	}

	public static void main(String[] args) {
		TreeMap<Integer, Integer>map=new TreeMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("------------this is your account--------");
		System.out.println("enter the operation you want to perform.");
		boolean flage=true;
		int i=1;
		while(flage) {
			System.out.println("1.to check you balance.\n2.to deposite amount.\n3.to withdraw amount.\n4. to exit.");
			int a=sc.nextInt();
			switch(a) {
			case 1:
				inquiry();
				break;
			case 2:
				System.out.println("enter amount you want to deposite:");
				long amt=sc.nextLong();
				deposit(amt);
				map.put(i, (int)balance);
				break;
			case 3:
				System.out.println("enter amount you want to withdraw:");
				long withdraw=sc.nextLong();
				withdraw(withdraw);
				map.put(i, (int)balance);
				break;
			case 4:
				flage=false;
				break;
				default:
					System.out.println("invalid input.....");
			}
			sc.close();
		}
//		Iterator<Integer,Integer> itr=map.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

	}

}
