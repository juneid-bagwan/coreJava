import java.util.Scanner;

public class volume_constr {
	volume_constr(){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number to find volume of cube");
			int a=sc.nextInt();
			System.out.println("volume of "+a+"="+(a*a*a));
		}
		
	}
volume_constr(int vol){
	System.out.println("volume of "+ vol+"="+(vol*vol*vol));
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find volume of cube");
		int a=sc.nextInt();
		volume_constr v=new volume_constr(a);
		volume_constr v1=new volume_constr();
		System.out.println(v+"  "+v1);
		sc.close();

	}

}
