package byteFileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteFileWriting {
	public static void main(String args[]) {
		try {
			FileOutputStream o = new FileOutputStream("D:\\abc.txt");
			String s = "i am juneid";
			byte b[] = s.getBytes();
			o.write(b);
			o.close();
			System.out.println("success...");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
