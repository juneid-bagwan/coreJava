package EmployeePrototype;

import java.io.IOException;

public class DemoEmp {

	public static void main(String[] args) throws NumberFormatException, IOException, CloneNotSupportedException {
		empDet empDet=new empDet();
		empDet.setMuster("symbiosis");
		empDet.loadData();
empDet.getL().remove(0);
//		empDet.u
		empDet d1=(empDet) empDet.clone();
		d1.setMuster("MIT");

		System.out.println(empDet);

		System.out.println(d1);
		
	}

}
