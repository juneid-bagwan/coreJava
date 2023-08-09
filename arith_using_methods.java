import java.util.Scanner;

public class arith_using_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a and b:");
Scanner sc =new Scanner(System.in);
arith_using_methods au= new arith_using_methods();
int a=sc.nextInt();
int b=sc.nextInt();
au.add(a,b);
au.sub(a,b);
au.mult(a,b);
au.div(a,b);
	}

	 void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("division is="+(a/b));
	}

	 void mult(int a, int b) {
		// TODO Auto-generated method stub
			System.out.println("multiplication is="+(a*b));

	}

	 void sub(int a, int b) {
		// TODO Auto-generated method stub
			System.out.println("subtraction is="+(a-b));

	}

	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition is="+(a+b));

	}
	

}
