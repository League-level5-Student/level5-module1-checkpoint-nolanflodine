
public class FasterFunctions {
	static float totalTime = 0;
	public static void main(String[] args) {			
		Thread t1 = new Thread(()->FasterFunctions.sort());
		Thread t2 = new Thread(()->FasterFunctions.ackerman());
		Thread t3 = new Thread(()->FasterFunctions.sqrt());
		t1.start();
		t2.start();
		t3.start();
	    //long startTime = System.currentTimeMillis();

		//float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
		//totalTime += endTime;
		//System.out.println("Total Time: " + totalTime);
	}

	public static void sort() {	
	    long startTime = System.currentTimeMillis();
		System.out.println("Starting slowSortLargeArray()...");
		SlowFunctions.slowSortLargeArray();
		System.out.println("slowSortLargeArray() Complete.");
		float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
		totalTime += endTime;
		System.out.println("slowSortLargeArray() Time: " + endTime + "\n\n");
	}
	
	public static void ackerman() {
	    long startTime = System.currentTimeMillis();
		System.out.println("Starting ackermann(3, 14)...");
		System.out.println("ackermann(3, 14): " + SlowFunctions.ackermann(3, 14));
		System.out.println("ackermann(3, 14) Complete.");
		float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
		totalTime += endTime;
		System.out.println("ackerman(3, 14) Time: " + endTime + "\n\n");
	}
	
	public static void sqrt() {
	    long startTime = System.currentTimeMillis();
		System.out.println("Starting millionsOfSqrts()...");
		SlowFunctions.millionsOfSqrts();
		System.out.println("millionsOfSqrts() Complete.");
		float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
		totalTime += endTime;
		System.out.println("Sqrts: " + endTime + "\n\n");
	}
}