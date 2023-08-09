import java.util.Scanner;

public class arith_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of a and b:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean flag = true;
		while (flag) {
			System.out.println("enter the operation you want to performe:\nadd\nsub\nmult\ndiv \nstop");
			String s = sc.next();
			switch (s) {
			case "add":
				System.out.println(a + b);
				break;
			case "sub":
				System.out.println(a - b);
				break;
			case "mult":
				System.out.println(a * b);
				break;
			case "div":
				System.out.println(a / b);
				break;
			case "stop":
				flag = false;
				break;
			default:
				System.out.println("not found");
			}
		}
	}

}
