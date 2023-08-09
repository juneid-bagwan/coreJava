import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five values :");
		int a,b,c,d,e,sum,avg;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		sum=a+b+c+d+e;
		avg=sum/5;
		System.out.println("sum is "+sum+" and average is "+avg);
	}

}
