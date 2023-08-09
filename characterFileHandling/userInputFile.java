package characterFileHandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class userInputFile {

	public static void main(String[] args) throws IOException {

		System.out.println("Ënter Any string:");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s = b.readLine();
		FileWriter[] w = new FileWriter[5];

		for (int i = 0; i < w.length; i++) {
			w[i] = new FileWriter("D:\\text" + i);
			w[i].write(i + "." + s);
			w[i].close();
		}

	}

}
