class stopwatch{

	private long startTime, endTime;

	stopwatch(){
		startTime = System.currentTimeMillis();
	}

	void start(){
		startTime = System.currentTimeMillis();
	}

	void stop(){
		endTime = System.currentTimeMillis();
	}

	long getElapsedTime(){
		return (getEndTime() - getStartTime());
	}

	long getStartTime(){
		return startTime;
	}

	long getEndTime(){
		return endTime;
	}
}
public class A7Q6 {

	public static void main(String[] args) {
		stopwatch s = new stopwatch();

		int a[] = new int[100];

		for (int i = 0; i < 100; i++ ) {
			a[i] = 0 + (int)(Math.random()*( 100 - 0 + 1 ));
		}
		s.start();
		System.out.println("Start time is = "+s.getStartTime());
		for ( int i = 0; i < a.length - 1; i++ ) {
			for ( int j = 1; j < a.length - i; j++ ) {
				if ( a[j-1] > a[j] ) {
					int swap = a[j];
					a[j] = a[j-1];
					a[j-1] = swap;
				}
			}
		}
		s.stop();
		System.out.println("End time is = "+s.getEndTime());
		System.out.println("Time taken to perform bubble sort = "+s.getElapsedTime());
		
	}

}
