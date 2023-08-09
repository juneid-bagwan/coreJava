import java.util.Scanner;

public class array_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 numbers in the array:");
		int a[]=new int [5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=true;
		while(flag) {
		System.out.println("enter the operation you want to performe:\n1.search element in array.\n2.find maximum number.\n3.find minimum number.\n4.find sum of all elements.\n5.all even numbers in array.\n6.to stop");
		int op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("enter the element you want to search:");
			int n=sc.nextInt();
			for(int b=0;b<a.length;b++) {
			if(a[b]==n) {
				System.out.println(n+" exisit in array ");
			break;	
			}
			else {
				System.out.println("element does not exisit ");
			
			}
			}
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
			int sum=0;
			for(int b=0;b<a.length;b++) {
				
				sum=sum+a[b];
				
				}
				System.out.println("sum of number in array is :"+sum);

			break;
		case 5:
			System.out.println("even number in array are:");
			for(int b=0;b<a.length;b++) {
			if(a[b]%2==0) {
				System.out.println(a[b]);
			}
			}
			break;
		case 6:
			flag=false;
			break;
		default:
				System.out.println("invalid input");
				break;
		}
		}
	}

}
