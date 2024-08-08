package DesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleToneEmp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		emp obj = emp.SetDetails();
		emp obj1 = emp.SetDetails();
		System.out.println(obj);
		System.out.println(obj1);
		
		
	}
}

class emp {
	public static emp obj = new emp();
	static int id;
	static String name;
	static int exp;
	static String skill;

	private emp() {

	}


	public static emp SetDetails()throws IOException 
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		 id = Integer.parseInt(b.readLine());
		System.out.println("enter name");
		 name = b.readLine();
		System.out.println("enter experience");
		 exp = Integer.parseInt(b.readLine());
		System.out.println("enter skils");
		 skill = b.readLine();
		if(exp<5) {
			
			System.out.println("your not eligible to get promotion");
			return obj;
		}
		System.out.println("do you know springboot.\ny/n");
		String a=b.readLine();
		System.out.println("do you know angular.\ny/n");
		String a1=b.readLine();
		System.out.println("do you know agile method.\ny/n");
		String a2=b.readLine();
		if(a.equals("y")&& a1.equals("y") && a2.equals("y")) {
			System.out.println(name+" you are promoted");
		}
		else {
			System.out.println("your not eligible to get promotion");

		}

			return obj;
		
		
				
		
	}

	
}
