import java.util.Scanner;

public class ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a b and c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		max=(a>b)?((a>c)?a:c):((b<c)?b:c);
		System.out.println(max);
		sc.close();
	}

}
