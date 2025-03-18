package _3_AFTEROOPS._01_exceptionhandling; // Package declaration

import java.io.FileReader; // Import FileReader class for reading files

public class ClassAEx03 {
	int available_balance = 5000; // Declares and initializes the available balance

	// Method to handle withdrawal transactions
	void meth1(int withdraw_amount) {
		// Checks if the withdrawal amount exceeds available balance
		if (available_balance < withdraw_amount) {
			// Throws an exception if insufficient balance
			throw new ArithmeticException("Insufficient Balance");
		} else {
			// Executes if balance is sufficient
			System.out.println("Transaction Successful");
			System.out.println("Please Collect your cash amount " + withdraw_amount);
		}
	}

	// Method to demonstrate checked exceptions
	void meth2() throws Exception { // Declares that this method may throw an exception
		System.out.println("Meth2() called"); // Prints method call message

		// Attempts to create a connection by reading a file
		FileReader fr = new FileReader("D:\\file.txt"); // May throw FileNotFoundException
		System.out.println("Connection created"); // Confirms file opened successfully

		fr.close(); // Closes the file connection
	}

	// Main method - program execution starts here
	public static void main(String[] arguments) throws Exception {
		ClassAEx03 aobj = new ClassAEx03(); // Creates an object of ClassA

		// Uncomment this line to test withdrawal functionality
		// aobj.meth1(6000); // Attempts to withdraw 6000 (may throw an exception)

		// Calls meth2() to demonstrate checked exceptions
		aobj.meth2();
	}
}
