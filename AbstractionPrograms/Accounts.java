package AbstractionPrograms;
interface Admin{
	void records();
	void name();
}
class Managment{
	void admission() {
		System.out.println("1000 addmissions.");
	}
	public void name() {
		System.out.println("i am admission");
	}
}
public class Accounts extends Managment implements Admin {
public void records() {
	System.out.println("20 admission.");
}
//@Override
//public void name() {
//	System.out.println("i am accounts");	
//	
//}
void billing() {
	System.out.println("20 lac.");
}
	public static void main(String[] args) {
		Accounts a=new Accounts();
		a.records();
		a.admission();
		a.billing();
		a.name();
	}

}
