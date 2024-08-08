import java.util.Scanner;

public class factorial_function {

	public static void main(String[] args) {
		int a;
		System.out.println("enter the number to find factorial:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int res=fact(a);
		System.out.println(res);
		sc.close();
	}

		static int fact(int a) {
			int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;

	}

}
