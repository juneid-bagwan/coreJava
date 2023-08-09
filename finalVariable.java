
public class finalVariable {
int id;
String name;
final int a=10;
public finalVariable(int id,String name) {
//	a=90; error cannot change final variable
	this.id=id;
	this.name=name;
}
void display() {
	System.out.println(id+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalVariable fv=new finalVariable(1, "juneid");
		fv.display();
		student s=new student(44,21,"juneid","j7");
		s.display();
	}

}
 class student {
	int rollno;
	String name;
	int age;
	String division;
	student(int a,int b,String c,String d){
		this.rollno=a;
		this.age=b;
		this.name=c;
		this.division=d;
	}
	void display() {
		System.out.println(rollno+name+division+age);
	}
}
