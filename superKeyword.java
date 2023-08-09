class a{
	int a=30;
	void display() {
		System.out.println("super class a");
	}
}
public class superKeyword extends a{
	int a=40;
	void display() {
		super.display();
		System.out.println("super class b");
		System.out.println("super class b:"+a);
		System.out.println("super class b:"+super.a);
	}
	public static void main(String[] args) {
		superKeyword s=new superKeyword();
		s.display();

	}

}
