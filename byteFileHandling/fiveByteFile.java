package byteFileHandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class fiveByteFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any string.");
		String s = br.readLine();
		FileOutputStream[] o = new FileOutputStream[5];
		byte b[] = s.getBytes();
		int i;
		for (i = 0; i < o.length; i++) {
		o[i] = new FileOutputStream( "D:\\file"+i);

		o[i].write(b);
		o[i].close();
		}
		System.out.println("done...");
	}

}
