package collectionframework;

//Define a public class named 'Student'
public class Ex02_Student {

	// Declare instance variables to store student details
	String sName; // To store the student's name
	String sBranch; // To store the student's branch (e.g., Computer Science, Electrical Engineering)
	int sMark; // To store the student's mark (e.g., percentage or score)

	// Constructor to initialize the Student object with name, branch, and mark
	public Ex02_Student(String sName, String sBranch, int sMark) {
		this.sName = sName; // Assign the provided name to the instance variable
		this.sBranch = sBranch; // Assign the provided branch to the instance variable
		this.sMark = sMark; // Assign the provided mark to the instance variable
	}

	// Override the toString() method to provide a custom string representation of the Student object
	@Override
	public String toString() {
		// Return a string that combines the student's name and mark
		return sName + " - " + sMark;
	}
}