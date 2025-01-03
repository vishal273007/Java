//Java program to compare the performance of String, StringBuffer, and StringBuilder for string concatenation.

package pkg10_com.string;

public class StringExClassSpeed {
	// Method to measure and compare the execution time of string concatenation
	// using different classes
	void meth1() {
		int iterations = 100000; // Number of iterations for concatenation
		String data = "a"; // Data to be concatenated in each iteration

		// Measuring time taken by String concatenation
		long startTime = System.currentTimeMillis(); // Start time for String
		String str = ""; // Initializing an empty String

		for (int i = 0; i < iterations; i++) {
			str += data; // Concatenating 'data' to the string
		}

		long endTime = System.currentTimeMillis(); // End time for String
		long stringDuration = endTime - startTime; // Calculating duration for String concatenation

		// Measuring time taken by StringBuffer concatenation
		startTime = System.currentTimeMillis(); // Start time for StringBuffer
		StringBuffer stringBuffer = new StringBuffer(); // Initializing StringBuffer

		for (int i = 0; i < iterations; i++) {
			stringBuffer.append(data); // Appending 'data' to StringBuffer
		}

		endTime = System.currentTimeMillis(); // End time for StringBuffer
		long stringBufferDuration = endTime - startTime; // Calculating duration for StringBuffer concatenation

		// Measuring time taken by StringBuilder concatenation
		startTime = System.currentTimeMillis(); // Start time for StringBuilder
		StringBuilder stringBuilder = new StringBuilder(); // Initializing StringBuilder

		for (int i = 0; i < iterations; i++) {
			stringBuilder.append(data); // Appending 'data' to StringBuilder
		}

		endTime = System.currentTimeMillis(); // End time for StringBuilder
		long stringBuilderDuration = endTime - startTime; // Calculating duration for StringBuilder concatenation

		// Printing the results of the comparisons
		System.out.println("Time taken for String concatenation: " + stringDuration + "ms");
		System.out.println("Time taken for StringBuffer concatenation: " + stringBufferDuration + "ms");
		System.out.println("Time taken for StringBuilder concatenation: " + stringBuilderDuration + "ms");
	}

	// Main method to execute the program
	public static void main(String[] args) {
		new StringExClassSpeed().meth1(); // Creating an instance of ClassB and calling meth1()
	}
}
