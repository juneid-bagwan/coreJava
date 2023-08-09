package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;
class oppo {
	String modelNo;
	ArrayList<String> aList = new ArrayList<String>();

	oppo(String MN) {
		this.modelNo = MN;
		aList.add(modelNo);
	}

	void show() {
		ListIterator<String> itr = aList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
}

public class ArrayListQuestion1 extends oppo {

	ArrayListQuestion1(String MN) {
		super(MN);
	}

	public static void main(String[] args) throws IOException {
		ArrayListQuestion1[] s = new ArrayListQuestion1[5];
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ":enter model no :");
			String s1 = b.readLine();
			s[i] = new ArrayListQuestion1(s1);
		}
		for (int i = 0; i < 5; i++) {
			s[i].show();
		}
		
		
	}
}
