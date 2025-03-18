package _3_AFTEROOPS._01_exceptionhandling; // Package declaration

// Import Scanner class to take user input
import java.util.Scanner;

// Define a public class for handling user-defined exceptions
public class UserDefinedException {
	// Initialize a static variable to store the current account balance
	static double current_balance = 100;

	// Main method - Program execution starts here
	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw: ");
		int n = sc.nextInt(); // Read the amount to withdraw

		try {
			// Check if the balance is less than the withdrawal amount
			if (current_balance < n) {
				// Throw a custom exception if balance is insufficient
				throw new MinimumAccountBalance("Please have the sufficient balance first");
			} else {
				// If sufficient balance, process withdrawal
				System.out.println("Please collect your cash: " + n);
			}
		}
		// Catch block to handle the custom exception
		catch (MinimumAccountBalance e) {
			System.out.println("catch block executed");
			e.printStackTrace(); // Print exception details
		}
		// Finally block to close the scanner object
		finally {
			sc.close();
		}
	}
}
