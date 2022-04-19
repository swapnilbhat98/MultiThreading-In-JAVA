import java.util.*;
public class MultiThread {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
		MultiThreadThing myThing = new MultiThreadThing(i);
		//MultiThreadThing myThing2 = new MultiThreadThing();
		
		myThing.start();
		//myThing2.start();
		}
		
		throw new RuntimeException();

	}

}
