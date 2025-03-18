package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01_ClassB {
	// Method to demonstrate adding ClassA objects into ArrayList and retrieving them
	void meth1() {
		// Print a message indicating the start of the example
		System.out.println("Passing user defined Class Object into ArrayList");

		// Create an ArrayList to hold ClassA objects
		ArrayList<Ex01_ClassA> al = new ArrayList<Ex01_ClassA>();

		// Create instances of ClassA representing employees
		Ex01_ClassA emp1 = new Ex01_ClassA("Athena", 27000, "Java");
		Ex01_ClassA emp2 = new Ex01_ClassA("Laxmi", 5000, "Oracle");
		Ex01_ClassA emp3 = new Ex01_ClassA("Lisa", 77000, "Spring");

		// Add the employee objects to the ArrayList
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(new Ex01_ClassA("Kelin", 99089, "Linux")); // Adding a new employee object directly

		// Print the ArrayList contents (employee objects)
		System.out.println(al);

		// Print a message indicating the start of iteration
		System.out.println("\nRetrieving data using Iterator\n");

		// Create an Iterator to traverse the ArrayList
		Iterator<Ex01_ClassA> i = al.iterator();

		// Use the iterator to go through each element in the ArrayList
		while (i.hasNext()) {
			// Print the current employee object
			System.out.println(i.next());
		}
	}

	// Main method to execute the program
	public static void main(String[] args) {
		// Create an object of ClassB
		Ex01_ClassB bobj = new Ex01_ClassB();

		// Call the method to execute the functionality
		bobj.meth1();
	}
}
