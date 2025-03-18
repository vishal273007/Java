// java program for IO-Streams. it has 4 types - 1. byte stream, 2. character stream, 3. data stream, 4. object stream.

// To test the program, just change the path of the file and arrange dummy data to test

package _3_AFTEROOPS._10_iostreams;

import java.io.FileInputStream; // This helps to read data from a file
import java.io.FileOutputStream; // This helps to write data to a file

public class ClassA {

	// This method reads data from a file
	void fileOperation1() throws Exception {
		System.out.println("Reading data from a file");

		// Creating a connection to the file where we want to read data from
		FileInputStream fis = new FileInputStream("C:\\Users\\Vishal Vishwakarma\\Desktop\\Java\\file1.txt");

		System.out.println("Connection created");

		int i;
		// Reading the file one byte at a time until there is no more data
		while ((i = fis.read()) != -1) {
			// Print the character by converting byte to char
			System.out.print((char) i); // typecasted the int data to char again
		}

		System.out.println("\nData read successfully");

		// Closing the file to free up resources
		fis.close(); // closing the resources
	}

	// This method writes data to a file
	void fileOperation2() throws Exception {
		System.out.println("Writing data into a file");

		// Creating a connection to the file where we want to write data to
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Vishal Vishwakarma\\Desktop\\Java\\file2.txt", true); // true for append

		System.out.println("Connection created");

		// The data we want to write to the file
		String data = ", because it is awesome";

		// Convert the string into bytes (because files store data in bytes)
		byte arr[] = data.getBytes();

		// Write the byte data into the file
		fos.write(arr);

		System.out.println("Data written successfully");

		// Closing the file after writing
		fos.close();
	}

	// This method copies data from one file to another
	void fileOperation3() throws Exception {
		System.out.println("Copying data from one file to another file");

		// Creating a connection to read from the source file
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Vishal Vishwakarma\\OneDrive\\Pictures\\Screenshots 1\\PM2.5_size.png");

		// Creating a connection to write to the destination file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Vishal Vishwakarma\\Desktop\\Java\\test.jpg");

		System.out.println("Connection created");

		int i;
		// Reading the source file and writing the data into the destination file
		while ((i = fis.read()) != -1) {
			fos.write(i); // Copy the data byte by byte
		}

		System.out.println("Data Copying completed");

		// Closing both files after the operation is done
		fis.close();
		fos.close();
	}

	// Main method to run the code
	public static void main(String[] args) throws Exception {
		ClassA aobj = new ClassA();

		// Uncomment any of these lines to perform the corresponding operation
		// aobj.fileOperation1(); // This will read data from the file
		// aobj.fileOperation2(); // This will write data to the file
		aobj.fileOperation3(); // This will copy data from one file to another
	}
}
