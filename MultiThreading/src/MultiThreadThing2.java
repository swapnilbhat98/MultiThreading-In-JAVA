//This is the class which does multi threading by implementing the runnable interface

public class MultiThreadThing2 implements Runnable {
	private int threadNumber;
	public MultiThreadThing2(int threadNumber)
	{
		this.threadNumber = threadNumber;
	}
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i + " from thread " + threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}


}
