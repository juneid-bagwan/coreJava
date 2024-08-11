package assignment1;

class student{
	int s_id,s_age;
	String s_name;
	
	
	student(){
	System.out.println("not found");
	}
	student(int s_id,int s_age,String s_name){
		this.s_id=s_id;
		this.s_age=s_age;
		this.s_name=s_name;
	}
	void display() {
		System.out.println("name:"+s_name);
		System.out.println("age:"+s_age);
		System.out.println("id:"+s_id);
	}
}
public class student_d {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student(001,21,"juneid");
		student s1=new student();
s.display();
	}

}
