package characterFileHandling;

import java.io.FileReader;
import java.io.IOException;

public class countCharacterFormFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\Demo.txt");
		int i, count = 0;
		while ((i = fr.read()) != -1) {
			count++;
			System.out.print((char) i);
		}
		fr.close();
		System.out.println("\ncount:" + count);

	}

}
