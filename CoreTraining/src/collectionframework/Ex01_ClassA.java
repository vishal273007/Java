
//Java program for passing user defined Class Object into ArrayList

package collectionframework;

public class Ex01_ClassA {
	// Declare instance variables for employee details
	String empName;
	int empSal;
	String empDept;

	// Constructor to initialize employee details
	public Ex01_ClassA(String empName, int empSal, String empDept) {
		this.empName = empName; // Assign employee name
		this.empSal = empSal; // Assign employee salary
		this.empDept = empDept; // Assign employee department
	}

	// Override toString method to represent employee details in a readable format
	@Override
	public String toString() {
		return empName + " - " + empDept; // Return employee name and department
	}
}
