class laptop{
	
	void price() {
		System.out.println("core laptaop:45000");
	}
	void generation() {
		System.out.println("core laptop:10th");
	}
	void processor() {
		System.out.println("core laptop:windows 10");
	}
}
class ipad extends laptop{
	void storage() {
		System.out.println("ipad:2TB");
	}
	void color() {
		System.out.println("ipad:black");
	}
}
class hp extends laptop{
	void display() {
		System.out.println("hp:screen touch");
	}
	void camera() {
		System.out.println("hp:50mp");
	}
}
public class dell extends laptop {
void security() {
	System.out.println("dell:finger print scanner");
}
void graphics() {
	System.out.println("dell:UHD graphic 4GB");
}
	public static void main(String[] args) {
dell d=new dell();
hp h=new hp();
ipad i=new ipad();
d.security();
d.graphics();
d.price();
d.processor();
h.camera();
h.display();
h.price();
h.processor();
i.color();
i.storage();
i.price();
i.processor();
	}

}
