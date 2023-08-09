package EmployeePrototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class empDet implements Cloneable {
	private String muster;
	List<pojo> l = new ArrayList<pojo>();

	

	

	public List<pojo> getL() {
		return l;
	}

	public void setL(List<pojo> l) {
		this.l = l;
	}

	public String getMuster() {
		return muster;
	}

	@Override
	public String toString() {
		return "empDet [muster=" + muster + ", l=" + l + "]";
	}

	public void setMuster(String muster) {
		this.muster = muster;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

	public void loadData() throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= 2; i++) {
			System.out.println("enter id name and salary");
			int a=Integer.parseInt(b.readLine());
			pojo p = new pojo();

			p.setId(a);
			String c=b.readLine();
			p.setName(c);
			int r=Integer.parseInt(b.readLine());
			p.setSalary(r);

			getL().add(p);
			
			
		}
	}

}
