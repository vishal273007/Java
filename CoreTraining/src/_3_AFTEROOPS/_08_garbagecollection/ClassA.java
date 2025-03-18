package _3_AFTEROOPS._08_garbagecollection;

public class ClassA {
	// Method that creates a new object of ClassA and prints a message
	void meth1() {
		System.out.println("meth1() called"); // Printing message when meth1() is called
		ClassA obj = new ClassA(); // Creating a new object of ClassA within meth1()
	}

	// Overriding the finalize() method to handle garbage collection
	@Override
	protected void finalize() {
		System.out.println("Garbage has been collected"); // Message when object is about to be garbage collected
	}

	public static void main(String[] args) {
		// Creating two objects of ClassA
		ClassA aobj1 = new ClassA(); // 1st object
		ClassA aobj2 = new ClassA(); // 2nd object

		aobj1.meth1(); // Calling meth1() on the first object (creates another object of ClassA)

		// Optionally printing the hashcodes of aobj1 and aobj2 (commented out for now)
		// System.out.println("\naobj1: " + aobj1.hashCode());
		// System.out.println("aobj2: " + aobj2.hashCode());

		// Uncommenting the following lines would demonstrate object reference changes:
		// aobj2 = aobj1;  // Both aobj2 and aobj1 will refer to the same object now
		// aobj1 = null;   // The first object becomes eligible for garbage collection

		System.gc(); // Explicitly requesting garbage collection (not guaranteed to run immediately)

		// Optionally printing the hashcodes of aobj1 and aobj2 again (commented out)
		// System.out.println("\naobj1: " + aobj1.hashCode());
		// System.out.println("aobj2: " + aobj2.hashCode());
	}
}
