import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int r;
		System.out.println("enter teh redius:");
		r=sc.nextInt();
		double area;
		double pi=3.14;
		area= pi*r*r;
		
		System.out.print("area of circle is"+area);
		sc.close();
	}

}
