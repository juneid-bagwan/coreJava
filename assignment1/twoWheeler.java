package assignment1;
class vehical{
	void avg() {
		System.out.println("average is:60km");
	}
}
public class twoWheeler extends vehical {
	void price() {
		System.out.println("2 wheeler price is:80k");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
twoWheeler w=new twoWheeler();
w.avg();
w.price();
	}

}
