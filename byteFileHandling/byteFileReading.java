package byteFileHandling;

import java.io.File;
import java.io.FileInputStream;

public class byteFileReading {

	public static void main(String[] args) {

		File file=new File("D:\\Demo.txt");
		FileInputStream fin=null;
		try {
			fin=new FileInputStream(file);
			byte filecontent[]=new byte[(int)file.length()];
			fin.read(filecontent);
			String s=new String(filecontent);
			System.out.println(s);
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
