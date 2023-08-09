package assignment1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterDemo {

	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		SimpleDateFormat fr=new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		System.out.println(fr.format(dt));
		SimpleDateFormat fr1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(fr1.format(dt));
		SimpleDateFormat fr2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		System.out.println(fr2.format(dt));
		SimpleDateFormat fr3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		System.out.println(fr3.format(dt));
		SimpleDateFormat fr4 = new SimpleDateFormat("dd MMM yyyy");
		System.out.println(fr4.format(dt));
	}

}
