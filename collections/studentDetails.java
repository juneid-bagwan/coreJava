package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@SuppressWarnings("rawtypes")
public class studentDetails {
	int id;
	String name;
	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	public studentDetails(int id, String name) {
		this.id = id;
		this.name = name;
		hm.put(id, name);
	}

	 void show() {
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		studentDetails stud[] = new studentDetails[10];
		for (int i = 0; i < stud.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the key value");
			int a = sc.nextInt();
			System.out.println("enter name");
			String s = sc.next();
			stud[i] = new studentDetails(a, s);
			sc.close();
		}
		for(int i=0;i<10;i++) {
			stud[i].show();
		}
		
	}

}
