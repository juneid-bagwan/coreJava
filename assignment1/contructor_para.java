package assignment1;

public class contructor_para {
	contructor_para(int a, String s) {
		System.out.println(a + ". i am consturctor with " + s);
	}

	public static void main(String[] args) {
		contructor_para cons = new contructor_para(1, "juneid majeed bagwan");
		System.out.println(cons);
	}

}
