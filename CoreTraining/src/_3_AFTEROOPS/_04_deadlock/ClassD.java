// Java program for demonstrating the deadlock.

package _3_AFTEROOPS._04_deadlock;

public class ClassD {
	public static void main(String[] args) {
		// Define two final String objects that will be used as lock objects
		final String A = "Java";
		final String B = "Python";

		// Create first thread demonstrating potential deadlock
		Thread t1 = new Thread() {
			@Override
			public void run() { // anonymouse inner class starts here
				// First, thread 1 tries to acquire lock on A
				synchronized (A) {
					System.out.println("Thread 1 locked on A");
					try {
						// Pause to simulate some processing and increase deadlock likelihood
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				// Then, thread 1 tries to acquire lock on B
				synchronized (B) { // thread will be waiting for python(B)
					System.out.println("Thread 1 locked on B");
				}

				// This line will not execute if deadlock occurs
				System.out.println("No deadlock");
			}
		}; // anonymous inner class ends here

		// Create second thread with reversed lock order
		Thread t2 = new Thread() {
			@Override
			public void run() {
				// First, thread 2 tries to acquire lock on B
				synchronized (B) { // thread 2 holding on B
					System.out.println("Thread t2 is locked on B");
					try {
						// Pause to simulate some processing and increase deadlock likelihood
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				// Then, thread 2 tries to acquire lock on A
				synchronized (A) { //Thread 2 will be waiting for java(A)
					System.out.println("Thread t2 locked on A");
				}

				// This line will not execute if deadlock occurs
				System.out.println("No deadlock");
			}
		};

		// Start both threads
		t1.start();
		t2.start();
	}
}