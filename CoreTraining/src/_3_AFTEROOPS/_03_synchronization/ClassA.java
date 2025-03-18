// java program for synchronization. synchronization is used for ensuring each thread access the resource at a time.

package _3_AFTEROOPS._03_synchronization;

//Define a class named ClassA that extends the Thread class
public class ClassA extends Thread {

	// Override the run() method to define the thread's task
	@Override
	public void run() {
		// Call the criticalResource() method
		criticalResorce();
	}

	// A synchronized method to ensure only one thread accesses it at a time
	synchronized void criticalResorce() {
		// Get the name of the current thread
		String name = Thread.currentThread().getName();

		// Print a message indicating the thread has entered the method
		System.out.println(name + " has entered in run()");

		// Loop to simulate some work being done by the thread
		for (int i = 1; i <= 5; i++) {
			// Print the thread's name and the current loop iteration
			System.out.println(name + " : " + i);
		}

		// Print a message indicating the thread has finished executing the method
		System.out.println(name + " has done executing run()");
	}

	// The main method where execution begins
	public static void main(String[] args) {
		// Create an instance of ClassA
		ClassA aobj = new ClassA();

		// Create two threads that will run the same object (aobj)
		Thread t1 = new Thread(aobj);
		Thread t2 = new Thread(aobj);

		// Set names for the threads
		t1.setName("Tom's Thread");
		t2.setName("Jerry's Thread");

		// Start both threads
		t1.start();
		t2.start();
	}
}
