//MultiThreading by using a class which implements the Runnable interface
public class MultiThread2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			MultiThreadThing myThing = new MultiThreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
			//myThread.join(); - it stops other threads for one thread to get completed first
			//myThread.isAlive(); - it returns true/false based on whether a thread is still running
			}
	}
}

