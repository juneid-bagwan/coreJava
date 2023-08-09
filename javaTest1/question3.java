package javaTest1;

public class question3 implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i*5);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		Thread t=new Thread(new question3());
//		question3 question3=new question3();
//		Thread thread=new Thread(question3);
		t.start();
		
	}

	

}
