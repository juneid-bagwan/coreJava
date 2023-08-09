
public class creatingThread extends Thread  implements Runnable{
	
public static void main(String[] args) {
	creatingThread thread=new creatingThread();//creating thread by runnable interface
	thread.run();
	creatingThread thread1=new creatingThread();//creating thread by thread class
	thread1.start();
}

@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("thread is running ");
}

}
