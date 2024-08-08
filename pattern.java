//import java.time.Clock;
//import java.time.Duration;

public class pattern {

	public static void main(String[] args) {
		int row=4;
		for(int i=1;i<=row+1;i++) {
			for(int j=i;j<=row+1;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
