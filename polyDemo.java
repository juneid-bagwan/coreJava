
public class polyDemo {

	public static void main(String[] args) {

		polyDemo p=new polyDemo();
		p.add(4,5);
		p.add(3,4,5);
	}

	 void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}

	 void add(int i, int j) {
		System.out.println(i+j);
	}

}
