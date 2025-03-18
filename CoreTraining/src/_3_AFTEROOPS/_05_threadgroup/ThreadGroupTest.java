// java program for ThreadGroup topic. Thread group is used for grouping multiple threads into single object. ThreadGroup class is used it.

package _3_AFTEROOPS._05_threadgroup;

public class ThreadGroupTest implements Runnable {
	// Run method prints thread name and priority
	@Override
	public void run() {
		// Display current thread's name and priority
		System.out.println(Thread.currentThread().getName() + " : Priority = " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// Create a Runnable object to be used by threads
		ThreadGroupTest robj = new ThreadGroupTest();

		// Create a new ThreadGroup named "Parent ThreadGroup"
		ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");

		// Set maximum priority for the thread group to 10
		tg.setMaxPriority(10);

		// Create three threads within the thread group
		Thread t1 = new Thread(tg, robj, "One");
		Thread t2 = new Thread(tg, robj, "Two");
		Thread t3 = new Thread(tg, robj, "Three");

		// Start the threads
		t1.start();
		t2.start();
		t3.start();

		// Print information about the thread group
		System.out.println("Active Threads: " + tg.activeCount());
		System.out.println("ThreadGroup Name: " + tg.getName());
	}
}