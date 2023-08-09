package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class courseUI {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choise;
		do {
			System.out.println("==================symbiosis college==================");
			System.out.println("choose course....");
			System.out.println("1.compter science.");
			System.out.println("2.civil engineering.");
			System.out.println("3.to exit");
			college c = new college();
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			choise = Integer.parseInt(b.readLine());
			switch (choise) {
			case 1:
				c.detcomputersci();
				break;
			case 2:
				c.detcivilengg();
				break;
			case 3:
				break;
			default:
				System.out.println("invalid input.");
				break;

			}
		} while (choise != 3);
	}

}
