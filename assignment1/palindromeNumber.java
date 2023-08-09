package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindromeNumber {
	static boolean ispalindrome(String str) {
		String rev = "";
		boolean ans = false;
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			ans = true;
		}

		return ans;
	}

	public static void main(String[] args) {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while (flag) {
			try {
				String s = b.readLine();
				boolean a = ispalindrome(s);
				System.out.println(a);
				System.out.println("you want to repeat:\ny/n");
				char c = (char) b.read();
				if (c == 'n') {
					flag = false;
				}

			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
