import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h,base;
		float area;
		System.out.println("enter the height and base:");
		h=sc.nextInt();
		base=sc.nextInt();

		area=(h*base)/2;
		System.out.println("area os triangle is "+area);
		sc.close();
	}

}
