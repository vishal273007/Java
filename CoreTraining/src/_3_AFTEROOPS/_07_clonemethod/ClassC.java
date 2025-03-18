// java program for clone method. clone is independent copy of an object. changes in clone object doesn't affect the original object.

package _3_AFTEROOPS._07_clonemethod;

public class ClassC {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Implementing clone method"); // Display message indicating clone method usage

		// Creating a ClassA object
		ClassA aobj1 = new ClassA();
		System.out.println("aobj1: " + aobj1.a + " " + aobj1.b); // Printing values of aobj1

		// Assigning aobj1 to aobj2 (reference copy)
		ClassA aobj2 = aobj1;

		// Changing the value of b in aobj2, which will also affect aobj1 (both point to the same object)
		aobj2.b = 1000;
		System.out.println(aobj1.a + " " + aobj1.b + " " + aobj2.b); // Both aobj1 and aobj2 share the same object, so both b values are the same

		// Creating a ClassB object
		ClassB bobj1 = new ClassB();
		System.out.println("bobj1: " + bobj1.x + " " + bobj1.y); // Printing values of bobj1

		// Creating a clone of bobj1 using the createClone() method
		ClassB bobj2 = bobj1.createClone();
		bobj2.y = 1000; // Changing the value of y in the cloned object (bobj2)

		// Printing values of bobj1 and bobj2. The x value remains the same, but y in bobj2 changes.
		System.out.println(bobj1.x + " " + bobj1.y + " " + bobj2.y);

		// Printing the x value of the cloned object (bobj2)
		System.out.println(bobj2.x);
	}
}
