package AbstractionPrograms;

abstract class car {
	abstract void engine();

	void price() {
		System.out.println("1 lac.");
	}
}


public class AbstractVehical extends car {
	@Override
	void engine() {
		System.out.println("my engine.");

	}

	public static void main(String[] args) {
		AbstractVehical v = new AbstractVehical();
		v.engine();
		v.price();
	}

}
