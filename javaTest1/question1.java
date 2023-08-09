package javaTest1;


import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many numbers you want to enter.");
		int n=sc.nextInt();
		System.out.println("enter "+n+" numbers in the array:");
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=true;
		while(flag) {
		System.out.println("enter the operation you want to performe:\n1.to find average of numbers.\n2.find maximum number.\n3.find minimum number.\n4.find sum of all elements.\n5.to stop");
		int op=sc.nextInt();
		switch(op) {
		case 1:
			int avg;
			int sum=0;
			for(int b=0;b<a.length;b++) {
				
				sum=sum+a[b];
				
				}
			avg=sum/(a.length);
			System.out.println("average:"+avg);
			break;
		case 2:
			int max=a[0];
			for(int b=0;b<a.length;b++) {
			if(a[b]>max) {
				max=a[b];
			}
			}
			System.out.println("maximum number is :"+max);
			break;
		case 3:
			int min=a[0];
			for(int b=0;b<a.length;b++) {
			if(a[b]<min) {
				min=a[b];
			}
			}
			System.out.println("minimum number is :"+min);
			break;
		case 4:
			int sum1=0;
			for(int b=0;b<a.length;b++) {
				
				sum1=sum1+a[b];
				
				}
				System.out.println("sum of number in array is :"+sum1);
			break;
		case 5:
			flag=false;
			break;
		default:
				System.out.println("invalid input");
				break;
		}
		}
		sc.close();
	}

}
