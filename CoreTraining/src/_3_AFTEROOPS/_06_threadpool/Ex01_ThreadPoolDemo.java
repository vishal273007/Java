// Java program for thread pool. in this, it is about how multiple thread can be in active state, terminated, and how another thread takes that place and continue th process.

package _3_AFTEROOPS._06_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Demonstrates how a thread pool works using a simple example
public class Ex01_ThreadPoolDemo extends Thread {
	private String msg; // A message that identifies each task

	// Constructor to set the message for the task
	public Ex01_ThreadPoolDemo(String s) {
		this.msg = s;
	}

	@Override
	synchronized public void run() {
		// Print a message when the task starts
		System.out.println(Thread.currentThread().getName() + " (Task Start: Message = " + msg + ")");

		// Simulate the task's work by calling processMessage
		processMessage();

		// Print a message when the task ends
		System.out.println(Thread.currentThread().getName() + " (Task End)");
	}

	// Simulates the work of the task with a delay
	private void processMessage() {
		try {
			// Pause the thread for 5 seconds to mimic a long-running task
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// Handle the case where the thread is interrupted
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Create a thread pool with a maximum of 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Create and submit 5 tasks to the thread pool
		for (int i = 1; i <= 5; i++) {
			// Create a new task with a unique message
			Ex01_ThreadPoolDemo tpdobj = new Ex01_ThreadPoolDemo("" + i);

			// Wrap the task in a Thread object
			Thread t = new Thread(tpdobj);

			// Submit the task to the thread pool for execution
			executor.execute(t);
		}

		// Shut down the thread pool after all tasks are submitted
		executor.shutdown();

		// Wait until all tasks are finished before proceeding
		while (!executor.isTerminated()) {
			// Busy-wait loop to ensure all threads complete (not optimal but simple)
		}

		// Print a message when all threads have finished
		System.out.println("Finished all Threads");
	}
}
