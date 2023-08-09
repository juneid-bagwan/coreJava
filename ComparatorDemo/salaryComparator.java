package ComparatorDemo;

import java.util.Comparator;

public class salaryComparator implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		if(o1.salary==o2.salary) {
			return 0;
		}
		else if(o1.salary>o2.salary) {
			return 1;
		}
		else {
			return -1;
		}
	}
	

}
