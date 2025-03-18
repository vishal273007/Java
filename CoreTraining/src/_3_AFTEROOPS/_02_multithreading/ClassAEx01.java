// Java example for MultiThreading.

package _3_AFTEROOPS._02_multithreading;

public class ClassAEx01 extends Thread { // step 1 - create a class that extends or implement Runnable interface
	public void run() { // step 2 - create a run() method because every thread executes the run() method automatically
		for (int i = 1; i <= 5; i++) {
			System.out.println("i value: " + i);
		}
	}

	public static void main(String[] args) {
		ClassAEx01 aobj = new ClassAEx01(); // step 3 - create a class object
		Thread t = new Thread(aobj); // step4 - create a Thread class object and attach it with the class object
		t.start(); // step5 - finally start the thread with the start() method
		System.out.println("This is the MultiThreading java program");
	}
}
