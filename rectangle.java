import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int area,l,w;

		System.out.println("enter length and width to calculate area ");
		l=sc.nextInt();
		w=sc.nextInt();
		area=l*w;
		System.out.println("area is "+area);
		sc.close();
	}

}
