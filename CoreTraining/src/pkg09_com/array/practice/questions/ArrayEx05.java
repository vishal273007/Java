
//Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

//makePi() ? [3, 1, 4]

package pkg09_com.array.practice.questions;

import java.util.Arrays; // need to import Arrays Class to view the array output, instead of irregular object location/orsomething.

public class ArrayEx05 {
	public int[] makePi() {

		// int arr[] = { 3, 1, 4 }; // declare and assign value to an array
		// return arr;
		return new int[] { 3, 1, 4 }; // another way to declare and initialize an array.
	}

	public static void main(String[] args) {
		ArrayEx05 aobj = new ArrayEx05();

		int result[] = aobj.makePi();

		System.out.println(result + " : -- Here's the object location with only aobj.meth(result)."); // this will print
																										// the
		// object location

		System.out.println(Arrays.toString(result)); // for correctly printing array element

		// System.out.println(Arrays.toString(aobj.makePi())); // Arrays.toString() to
		// print the array element, preventing
		// printing the object printing.
	}
}