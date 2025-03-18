// java program for synchronization. This is synchronization block method.

package _3_AFTEROOPS._03_synchronization;

//Define a class named ClassB that extends the Thread class
public class ClassB extends Thread {

	// Override the run() method to define the task for the thread
	@Override
	public void run() {
		// Get the name of the current thread
		String name = Thread.currentThread().getName();

		// Print a message when the thread starts running
		System.out.println(name + " has entered run()");

		// Synchronized block to allow only one thread to execute the critical section at a time
		synchronized (this) {
			// Loop to simulate some work being done
			for (int i = 1; i <= 5; i++) {
				// Print the thread's name and the current loop iteration
				System.out.println(name + ": " + i);
			}
		}

		// Print a message when the thread finishes its execution
		System.out.println(name + " completed run() execution");
	}

	// The main method where program execution begins
	public static void main(String[] args) {
		// Create an instance of ClassB
		ClassB bobj = new ClassB();

		// Create two threads that will execute the same object (bobj)
		Thread t1 = new Thread(bobj);
		Thread t2 = new Thread(bobj);

		// Set names for the threads
		t1.setName("First Thread");
		t2.setName("Second Thread");

		// Start both threads
		t1.start();
		t2.start();
	}
}
