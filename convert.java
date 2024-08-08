import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter weight in grams:");
		float gm, kg;
		gm = sc.nextInt();
		kg = gm / 1000;
		System.out.println("weight in kilogram is " + kg);
		sc.close();
	}

}
