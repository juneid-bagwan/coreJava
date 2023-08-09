package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;

public class mainEMP {

	public static void main(String[] args) {
		ArrayList<employee> m = new ArrayList<employee>();
		m.add(new employee(100, 50,"sohail"));
		m.add(new employee(105, 150, "juneid"));
		m.add(new employee(102, 855, "faiz"));
		m.add(new employee(100, 400000,"asif" ));
		System.out.println("sort by id:");
		Collections.sort(m,new idComparator());
		for(employee e:m) {
			System.out.println(e.id+"\t"+e.name+"\t"+e.salary);
		}
		System.out.println("sort by name:");
		Collections.sort(m,new nameComparator());
		for(employee e:m) {
			System.out.println(e.id+"\t"+e.name+"\t"+e.salary);
		}
		System.out.println("sort by salary:");
		Collections.sort(m,new salaryComparator());
		for(employee e:m) {
			System.out.println(e.id+"\t"+e.name+"\t"+e.salary);
		}
		
	}

}
