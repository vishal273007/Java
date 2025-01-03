
// Java program for String handling techniques.

package pkg10_com.string;

public class StringEx01 {
	void meth1() {
		System.out.println("---meth1() called---");
		String s1 = "java";
		String s2 = new String("java");

		char arr[] = { 'j', 'a', 'v', 'a' }; // creating an array of char and storing that char in another string, thus,
												// that becomes string.
		String s3 = new String(arr);

		String s4 = new String(arr, 2, 2); // here, in new String contents, arr means array elements, first 2 means
											// starting lenth, and last 2 means how many numbers.

		System.out.println("s1: " + s1 + "(" + s1.length() + ")");
		System.out.println("s2: " + s2 + "(" + s2.length() + ")");
		System.out.println("s3: " + s3 + "(" + s3.length() + ")");
		System.out.println("s4: " + s4 + "(" + s4.length() + ")");

	}

	void meth2() {
		System.out.println("\n---meth2() called---");
		System.out.println("String which were created by String class are immutable.");

		String s = "java";
		System.out.println("Before concatination s: " + s);

		// System.out.println(s.concat(" is awesome"));
		s = s.concat(" is awesome"); // concatenating s value with String inside concat() method and storing whole
										// value inside s variable for later use.

		System.out.println("After concatination s: " + s);
	}

	public static void main(String[] arguments) {
		StringEx01 aobj = new StringEx01();
		// aobj.meth1();
		aobj.meth2();
	}
}