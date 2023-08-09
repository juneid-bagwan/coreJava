package assignment1;

public class static_variableMethods { 
	static int l=49;    						//static variable

	public static void main(String[] args) {
		add(5,6);
System.out.println(l);
	}

	static void add(int a,int b) {             //static method access directly
		System.out.println(a+b); 
	}

}
