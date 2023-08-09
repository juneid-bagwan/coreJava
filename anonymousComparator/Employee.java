package anonymousComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		ArrayList<Employee> Employee_List = new ArrayList<Employee>();

		Employee_List.add(new Employee("aafan", 3000));
		Employee_List.add(new Employee("juneid", 2500));
		Employee_List.add(new Employee("sohail", 4000));
		Employee_List.add(new Employee("shadab", 5000));
		Employee_List.add(new Employee("sadik", 45500));
		Employee_List.add(new Employee("shaib", 3500));

		Collections.sort(Employee_List, new Comparator<Employee>() {
			public int compare(Employee emp1, Employee emp2) {
				if (emp1.salary > emp2.salary) {
					return 1;
				}
				return -1;
			}
		});

		System.out.println("Name\tSalary");
		System.out.println();
		for (Employee Employee :  Employee_List) {
			System.out.println(Employee.name + "  =  " + Employee.salary);
		}

	}
}
