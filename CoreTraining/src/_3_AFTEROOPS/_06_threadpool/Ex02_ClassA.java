// Java program for Thread pool exlaining about using daemon can shutdown the jvm from running even the infinite loop

package _3_AFTEROOPS._06_threadpool;

//A simple example demonstrating daemon threads in Java
public class Ex02_ClassA extends Thread {

	// The run() method contains the code executed by the thread
	@Override
	public void run() {
		int i = 1;
		// Infinite loop to keep printing the thread's output
		while (true) {
			System.out.println("Thread ==> " + i++);
		}
	}

	public static void main(String[] args) {
		// Create an instance of the ClassA thread
		Ex02_ClassA aobj = new Ex02_ClassA();

		// Wrap the ClassA thread in another Thread object
		Thread t = new Thread(aobj);

		// Set the thread as a daemon thread
		// Daemon threads run in the background and stop when the main thread ends
		t.setDaemon(true);

		// Start the thread
		t.start();

		// Main thread prints numbers from 1 to 20
		for (int i = 1; i <= 20; i++) {
			System.out.println("main() : " + i);
		}
		// After the loop ends, the main thread finishes, 
		// and the daemon thread (t) also stops running.
	}
}
