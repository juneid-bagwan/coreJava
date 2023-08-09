package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;

class employee {
	int id;
	String name;
	int salary;
	TreeSet<Integer> ts = new TreeSet<Integer>();

	public employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		ts.add(salary);
	}

	void show() {
		Iterator<Integer> itr = ts.iterator();

		while (itr.hasNext()) {
			System.out.println("salary:"+itr.next() +"\tname:"+name+"\tid:"+id);
		}
	}

	void salaryIsLess() {
		Iterator<Integer> itr = ts.iterator();
		while (itr.hasNext()) {
			int f=itr.next();
			if (f< 20000) {
				System.out.println("salary:"+f+"\tname:"+name+"\tid:"+id);
			}
		}
	}
}

public class treeSetQuestion1 {

	public static void main(String[] args) throws IOException {
		employee[] s = new employee[5];
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			System.out.println("enter id:");
			int id = Integer.parseInt(b.readLine());
			System.out.println(":enter name:");
			String name = b.readLine();
			System.out.println("enter salary:");
			int salary = Integer.parseInt(b.readLine());
			s[i] = new employee(id, name, salary);
		}
		System.out.println("----------all records----------");
		for (int i = 0; i < 5; i++) {
			s[i].show();
		}
		System.out.println("--------salary less than 20000-------");
		for (int i = 0; i < 5; i++) {
			s[i].salaryIsLess(  );
		}

	}
}
