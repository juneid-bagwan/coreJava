package facade;

public class college {
	private course computerSci;
	private course civilEngg;

	public college() {
		super();
		computerSci = new computerSci();
		civilEngg = new civilEngg();
	}
	void detcomputersci() {
		computerSci.cousreName();
		computerSci.fees();
	}
	void detcivilengg() {
		civilEngg.cousreName();
		civilEngg.fees();
	}
}
