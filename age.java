import java.util.Scanner;

import AbstractionPrograms.demoPrivate;
public class age {

	public static void main(String[] args) {
//		demoPrivate p=new demoPrivate();
//		int a=p.add(5, 6);
//		System.out.println(a);
//		// TODO Auto-generated method stub
//		int age;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter your age");
//		age=sc.nextInt();
//		if(age>=18) {
//			System.out.println("eligible for voting");
//		}
//		else {
//			System.out.println("not eligible for voting");
//		}
//		byte b=127;
//		b++;
//		b++;
//		System.out.println(b);
//		for(int a=0;a<5;a++) {
//			for(int b=0;b<a;b++) {
//				if(a%2==0) {
//					System.out.print("@");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}


		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter the value of n: ");
		        int n = input.nextInt();

		        int count = 0;
		        int number = 2;
		        while (count < n) {
		            if (isPrime(number)) {
		                System.out.println(number);
		                count++;
		            }
		            number++;
		        }
		    }

		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i < num; i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    

	}

}
