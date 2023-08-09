import java.util.Scanner;

public class even_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			

		}
		System.out.println("even number in array are:");
		for(int b=0;b<a.length;b++) {
		if(a[b]%2==0) {
			System.out.println(a[b]);
		}
	}
	}

}
