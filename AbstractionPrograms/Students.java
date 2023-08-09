package AbstractionPrograms;

interface college {
	void collegeName();
}

interface scienceDep extends college {
	void science();
}

class commerceDep implements college {
	public void collegeName() {
		System.out.println("akis poona college.");
	}

	void Com() {
		System.out.println("20 commerce students. ");
	}
}

public class Students extends commerceDep implements scienceDep {

	public void science() {
		System.out.println("50 student in science department. ");
	}

	void studfees() {
		System.out.println("student fees is 80k only.");
	}

	public static void main(String[] args) {
		Students s = new Students();
		s.collegeName();
		s.science();
		s.Com();
		s.studfees();

	}

}
