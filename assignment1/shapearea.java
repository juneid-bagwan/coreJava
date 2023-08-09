package assignment1;

class Area {
	synchronized public void area(String s) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class first extends Thread {
	Area a = new Area();

	public first(Area a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.area("area of rectangle");
	}
}

class second extends Thread {
	Area a = new Area();

	public second(Area a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.area("area of circle");
	}
}

public class shapearea {

	public static void main(String[] args) {
		first t1 = new first(new Area());
		second t2 = new second(new Area());
		t1.start();
		t2.start();
	}

}
