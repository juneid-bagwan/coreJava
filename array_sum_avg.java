import java.util.Scanner;

public class array_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,avg;
		int a[]=new int [5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			

		}
		for(int b=0;b<a.length;b++) {
		
		sum=sum+a[b];
		
		}
		avg=sum/a.length;
		System.out.println("sum of number in array is :"+sum+"\n and average is: "+avg);
sc.close();
		}
		
	}
