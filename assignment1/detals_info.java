package assignment1;

import java.util.Scanner;

class employee {
	int id, mobileNo, salary;
	String name, post, depart;

	 employee(int id, String name, int mobileno, String post, int salary, String dept) {
		this.id = id;
		this.name = name;
		this.mobileNo = mobileno;
		this.post = post;
		this.salary = salary;
		this.depart = dept;
	}

	void show() {
		System.out.println("id=" + id);
		System.out.println("id=" + name);
		System.out.println("id" + mobileNo);
		System.out.println("id=" + post);
		System.out.println("id=" + salary);
		System.out.println("id=" + depart);
	}
}

public class detals_info {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("enter the employee details \nid\nname\nmobile no\npost\nsalary\ndepartment");
			Scanner sc = new Scanner(System.in);
			int a1 = sc.nextInt();
			String a2 = sc.next();
			int a3 = sc.nextInt();
			String a4 = sc.next();
			int a5 = sc.nextInt();
			String a6 = sc.next();
			employee juneid = new employee(a1, a2, a3, a4, a5, a6);
			juneid.show();
			sc.close();
		}
	}

}
