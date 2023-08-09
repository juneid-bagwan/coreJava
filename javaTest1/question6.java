package javaTest1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class question6 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\question6");
			FileReader fr = new FileReader("D:\\question6");
			String s = "helloWorld";
			
			fw.write(s);
			fw.close();

			int i, count = 0;
			while ((i = fr.read()) != -1) {
				count++;
				System.out.print((char) i);
			}
			fr.close();
			System.out.println("\nnumber of charater in string " + s + " is " + count);

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
