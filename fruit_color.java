import java.util.Scanner;

public class fruit_color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the color:\noptions are yellow \n green\norange\nred:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s) {
		case "red":
			System.out.println("apple and cherry");
			break;
		case "yellow":
			System.out.println("banana and mango");
			break;
		case "green":
			System.out.println("watermelon and pear");
			break;
		case "orange":
			System.out.println("orange and papaya");
			break;
			default:
				System.out.println("not fruit found");
		}
	}

}
