
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="jund";
		System.out.println(containsVowl(a));
	}
	static boolean containsVowl(String s) {
		return s.toLowerCase().matches(".*[aeiou].*"); 
		
	}

}
