package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

 public class blueStar {
	int p_id, price, warenty_year;
	String module_no;
	Date expiry_date;

	 blueStar(int p_id, int price, String module_no, Date expiry_date, int warenty_year) {
		this.p_id = p_id;
		this.price = price;
		this.module_no = module_no;
		this.expiry_date = expiry_date;
		this.warenty_year = warenty_year;
	}
	void details() {
		System.out.println("machine id : " + p_id);
		System.out.println("machine price : " + price);
		System.out.println("machine module number : " + module_no);
		System.out.println("machine expiry date : " + expiry_date);
		System.out.println("machine warenty :" + warenty_year + "year");
	}

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		blueStar star[] = new blueStar[5];
		for (int i = 0; i < 5; i++) {

			System.out.println("enter machine id:");
			int id = Integer.parseInt(buffer.readLine());
			System.out.println("enter machine price:");
			int price = Integer.parseInt(buffer.readLine());
			System.out.println("enter machine module number:");
			String moduleNo = buffer.readLine();
			System.out.println("enter machine expiry date in this formate 01-jan-2000 :");
			Date date = new SimpleDateFormat("dd-MMM-yyyy").parse(buffer.readLine());
			System.out.println("enter machine warenty year(enter integer):");
			int year = Integer.parseInt(buffer.readLine());
			star[i] = new blueStar(id, price, moduleNo, date, year);
			star[i].details();
			System.out.println("\n\n");
		}
		star[0].details();
		star[1].details();
		star[2].details();
		star[3].details();
		star[4].details();
	}

}
