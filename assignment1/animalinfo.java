package assignment1;
class animal{
	static class InnerAnimal{
		void height() {
			System.out.println("average height of animal is 4.5ft");
		}
		void age() {
			System.out.println("average age of animal is 12 year");
		}
		void weight(){
			System.out.println("average weight of animal is 40kg");
		}
	}
}
public class animalinfo {

	public static void main(String[] args) {
		animal.InnerAnimal a=new animal.InnerAnimal();
		a.height();
		a.age();
		a.weight();

	}

}
