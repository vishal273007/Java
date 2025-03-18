// java program for multithreading topic explaing start() and run() method for a thread. Dated 10 Jan 2025

package _3_AFTEROOPS._02_multithreading;

public class ClassAEx02 implements Runnable {

	// The run() method will define what the thread will do
	// In this case, it will print the value of i from 1 to 5
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i value: " + i); // Print the value of i
		}
	}

	public static void main(String[] args) {

		// Create an object of ClassA
		ClassAEx02 aobj = new ClassAEx02();

		// Create a new thread t1, and pass the ClassA object (which implements Runnable) to it
		Thread t1 = new Thread(aobj);

		// Start the thread t1. This will call the run() method in ClassA
		t1.start();

		// Calling run() directly on the thread, which will NOT run in a separate thread.
		// It will just execute the code in the current main thread (not recommended for multi-threading).
		t1.run();

		// Create a second thread t2, and pass the same ClassA object (Runnable) to it
		Thread t2 = new Thread(aobj);

		// Start the second thread t2, this will call the run() method in ClassA in a separate thread
		t2.start();

		// Calling run() directly on t2, which will NOT run in a separate thread.
		// Just executes the code in the main thread (again, not recommended for multi-threading).
		t2.run();
	}
}
