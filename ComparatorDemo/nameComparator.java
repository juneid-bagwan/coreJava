package ComparatorDemo;

import java.util.Comparator;

public class nameComparator implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		return o1.name.compareTo(o2.name);
	}

}
