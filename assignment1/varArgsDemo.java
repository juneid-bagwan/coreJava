package assignment1;

public class varArgsDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a[]= {12,23,54};
		int a1[]= {2,3,4};

		Display(a);
		Display(1,2);
		Display(1,2,3);
		Display(1,2,3,4);
		Display(1,2,3,4,5);
		
	}

	

	static void Display(int ...a) {
		 for(int i:a)
		 System.out.println(i);
		
	}

}
