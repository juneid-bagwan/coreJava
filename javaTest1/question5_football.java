package javaTest1;

class sports {
	void sportsNames() {
		System.out.println("cricket\nfootabll\n");
	}
}

class cricket extends sports {
	void cricketPalyers() {
		System.out.println("virat\ndhoni");
	}
}

public class question5_football extends sports {
	void footballPlayers() {
		System.out.println("nymar\nmessi\nronaldo");
	}

	public static void main(String[] args) {
		question5_football f=new question5_football();
		f.sportsNames();
		f.footballPlayers();
		System.out.println("\n\n");
		cricket c=new cricket();
		c.sportsNames();
		c.cricketPalyers();
	}

}
