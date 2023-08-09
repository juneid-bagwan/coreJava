package characterFileHandling;

import java.io.FileReader;
import java.io.IOException;

public class differentDirectoryFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\Demo.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		fr.close();
	}

}
