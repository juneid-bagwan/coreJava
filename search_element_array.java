import java.util.Scanner;

public class search_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			

		}
		System.out.println("enter the element you want to search:");
		int n=sc.nextInt();
		for(int b=0;b<a.length;b++) {
		if(a[b]==n) {
			System.out.println(n+" exisit in array");
			break;
		}
		sc.close();
	}
		
	}

}
