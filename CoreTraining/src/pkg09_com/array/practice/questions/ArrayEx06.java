//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

//commonEnd([1, 2, 3], [7, 3]) ? true
//commonEnd([1, 2, 3], [7, 3, 2]) ? false
//commonEnd([1, 2, 3], [1, 3]) ? true

package pkg09_com.array.practice.questions;

public class ArrayEx06 {
	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) // first, comparing first element of both arrays, second
																// comparing last element of both arrays with
																// a[last_element] == b[last_element] --> a[a.length -1]
																// == b[b.length -1].
			return true;
		return false;
	}

	public static void main(String[] args) {
		ArrayEx06 aobj = new ArrayEx06();
		int input1[] = { 1, 2, 3 };
		int input2[] = { 7, 3 };
		boolean result = aobj.commonEnd(input1, input2); // creating boolean variable and storing the value returned by
															// method. second, passing the values to the method for
															// calculation.
		System.out.println(result);
	}
}

//vs code emmets:
//main - for main method
//out - for println statement