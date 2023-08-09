package ComparatorDemo;

import java.util.Comparator;

public class idComparator implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		if(o1.id==o2.id) {
			return 0;
		}
		else if(o1.id>o2.id) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}

}
