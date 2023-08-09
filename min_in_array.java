import java.util.Scanner;

public class min_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			

		}
		int min=a[0];

		for(int b=0;b<a.length;b++) {
		if(a[b]<min) {
			min=a[b];
		}
		}
		System.out.println("minimum nubmer is :"+min);
		
	}

}
