package _1_BASICS.controlstatements.IfElseExamples;

public class Ex4IfElse {
	String meth1(int a, int b, int c) {
		String result;

		if (a > b) {
			if (b > c) {
				result = "a > b > c";
			} else if (a > c) {
				result = "a > c > b";
			} else {
				result = "c > a > b";
			}
		} else {
			if (a > c) {
				result = "b > a > c";
			} else if (b > c) {
				result = "b > c > a";
			} else {
				result = "c > b > a";
			}
		}
		if (a == b) {
			if (b == c) {
				result = "a == b == c";
			} else if (a > c) {
				result = "a == b > c";
			} else {
				result = "c > a == b";
			}
		} else if (b == c) {
			if (a > b) {
				result = "a > b == c";
			} else {
				result = "b == c > a";
			}
		} else if (a == c) {
			if (b > a) {
				result = "b > a == c";
			} else {
				result = "a == c > b";
			}
		}

		return result; // Add missing return statement
	}

	public static void main(String[] args) {
		Ex4IfElse aobj = new Ex4IfElse();
		System.out.println(aobj.meth1(3, 2, 1)); // Display the result
		System.out.println(aobj.meth1(1, 2, 3));
		System.out.println(aobj.meth1(2, 3, 1));
		System.out.println(aobj.meth1(1, 1, 1));
		System.out.println(aobj.meth1(2, 2, 3));
		System.out.println(aobj.meth1(3, 1, 1));
		System.out.println(aobj.meth1(1, 3, 2));
		System.out.println(aobj.meth1(2, 1, 2));
	}
}
