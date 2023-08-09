package IteratorDP;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		CollectionofNames cmpnyRepository = new CollectionofNames();

		for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
		for (Iterator iter = cmpnyRepository.getIterator1(); iter.hasNext();) {
			int age = (int) iter.next();
			System.out.println("Age : " + age);
		}

	}
}
