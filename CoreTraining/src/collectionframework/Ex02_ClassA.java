// java program for ArrayList. Using student class and class A to perform some tasks.

package collectionframework;

//Import the ArrayList class from the java.util package
import java.util.ArrayList;

//Define a public class named 'ClassA'
public class Ex02_ClassA {

	// Define a method named 'meth1' that takes three parameters:
	// 1. An ArrayList of Strings (al1)
	// 2. A boolean array (arr)
	// 3. An ArrayList of Integers (al2)
	// The method returns an ArrayList of Student objects
	ArrayList<Ex02_Student> meth1(ArrayList<String> al1, boolean arr[], ArrayList<Integer> al2) {

		// Task 1: Print the elements of al1 in reverse order
		System.out.println("==============Task1==============");
		for (int i = al1.size() - 1; i >= 0; i--) {
			System.out.println(al1.get(i) + " ");
		}

		// Task 2: Print all elements of the boolean array arr
		System.out.println("\n==============Task2================");
		for (boolean data : arr) {
			System.out.println(data + " ");
		}

		// Task 3: Create a new ArrayList (al3) and add elements of al2 in reverse order
		System.out.println("\n===========Task3=================");
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		for (int i = al2.size() - 1; i >= 0; i--) {
			al3.add(al2.get(i)); // Add elements from al2 to al3 in reverse order
		}
		System.out.println("al3: " + al3); // Print the contents of al3

		// Return null (the method is expected to return an ArrayList<Student>, but it currently returns null)
		return null;
	}

	// Main method to test the functionality of ClassA
	public static void main(String[] args) {
		// Create an object of ClassA
		Ex02_ClassA aobj = new Ex02_ClassA();

		// Create an ArrayList of Strings (input1) and add some countries
		ArrayList<String> input1 = new ArrayList<String>();
		input1.add("India");
		input1.add("Canada");
		input1.add("China");

		// Create a boolean array (input2) with some values
		boolean input2[] = { true, false, true };

		// Create an ArrayList of Integers (input3) and add some numbers
		ArrayList<Integer> input3 = new ArrayList<Integer>();
		input3.add(10);
		input3.add(20);
		input3.add(30);

		// Call the meth1 method with the created inputs and store the result
		ArrayList<Ex02_Student> result = aobj.meth1(input1, input2, input3);

	}
}