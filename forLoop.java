
public class forLoop {

	public static void main(String[] args) {
		// Q1.20 to 40 numbers in reverse order
		for(int i=40;i>=20;i--) 
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		//only even numbers from 1 to 20
		for(int i=1;i<=20;i++) 
		{
			if(i%2==0) 
			{
			System.out.print(i+"\t");
			}
		}
		System.out.println();
		//print sum of number from 20 to 30 and check sum is even or odd
		int sum=0;
		for(int i=20;i<=30;i++) 
		{
			sum=sum+i;
		}
		System.out.println("sum of number form 20 to 30 is="+sum);
		if(sum%2==0) 
		{
		System.out.println("sum is even");
		}
		else {
			System.out.println("sum is odd");
		}
		System.out.println();
		//print the odd number 1 to 100 in reverse order
		for(int i=100;i>=0;i--) 
		{
			if(i%2==1) {
			System.out.print(i+"\t");
			}
		}
		for(;;) {			//infinite loop
			System.out.println("one");
		}
	}

}
