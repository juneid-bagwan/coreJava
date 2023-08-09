package javaTest1;

public class question2 {

	public static void main(String[] args) {
		String s = new String("juneid");
		String s1 = "bagwan";
		System.out.println("equal method:" + s.equals(s1));
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("reverse string is:"+rev);
		System.out.println("index of g is:"+s1.indexOf('g')+" in string:"+s1);
		System.out.println("chararcter at index 3 is:"+s1.charAt(3));
		System.out.println("sub string of bagwan at 2 to 4 is:"+s1.substring(2, 4));
	}

}
