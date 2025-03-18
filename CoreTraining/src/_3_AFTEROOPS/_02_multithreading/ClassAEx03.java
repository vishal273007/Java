// java program to getting the name and priority of thread on 10-Jan-25

package _3_AFTEROOPS._02_multithreading;

public class ClassAEx03 extends Thread {

	// The run() method will define what the thread will do
	// In this case, it prints the value of i from 1 to 5
	public void run() {
		// Get the name of the current thread (this could be "First-Thread" or "Second-Thread" as set below)
		String name = Thread.currentThread().getName();

		// Get the priority of the current thread (1 is lowest and 10 is highest)
		int priority = Thread.currentThread().getPriority();

		// Print the thread's name and priority
		System.out.println("Thread Name: " + name);
		System.out.println("Thread Priority: " + priority);

		// Loop to print the value of i from 1 to 5
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + " - i value is: " + i);
		}
	}

	public static void main(String[] args) {

		// Create an object of ClassA, which extends Thread
		ClassAEx03 aobj = new ClassAEx03();

		// Create two thread objects t1 and t2 using the aobj instance
		Thread t1 = new Thread(aobj);
		Thread t2 = new Thread(aobj);

		// Set the names of the threads
		t1.setName("First-Thread");
		t2.setName("Second-Thread");

		// Set the priority of the threads (1 is lowest, 10 is highest)
		t1.setPriority(1); // Lowest priority
		t2.setPriority(10); // Highest priority

		// Start both threads. This calls the run() method in each thread.
		t1.start();
		t2.start();
	}
}
