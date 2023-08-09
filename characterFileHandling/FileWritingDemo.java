package characterFileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("D:\\juneidb.txt");
		String s = "i am juneid bagwan";
		f.write(s);
		f.close();
		System.out.println("done...");
	}

}
