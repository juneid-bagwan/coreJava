package assignment1;

public class finalKeyword {
final int a=10;
	public static void main(String[] args) {
		finalKeyword f=new finalKeyword();
		//  f.a=100;						error final variable cannot be Reinitialize
System.out.println(f.a);
int c=f.a+20;
System.out.println(c);
	}

}
