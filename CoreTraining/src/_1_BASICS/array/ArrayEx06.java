// Java program for Array practice.

package _1_BASICS.array;

import java.util.Arrays;

public class ArrayEx06 {
	String[] meth1(int arr[]) {
		System.out.println("arr: " + Arrays.toString(arr));
		String data[] = { "hi", "hello", "java" };
		return data;
		// return new String[] {"hi" , "hello" , "java"};
	}

	public static void main(String[] args) {
		ArrayEx06 aobj = new ArrayEx06();
		// aobj.meth1(new int[] {10,20,30}); // 1st way

		// Define the input array
		int input[] = { 10, 20, 30 };
		String[] result = aobj.meth1(input); // 2nd way

		System.out.println("result: " + Arrays.toString(result));
	}
}