//Java program for the usage of String Class Methods.

package pkg10_com.string;

import java.util.Arrays;
import java.util.Scanner; //don't forget to import otherwise compilation error will occur.

public class StringEx02 {
	void meth1() {
		System.out.println("----meth1() called----");
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = new String("Java");

		// --------------equals()-------------------
		// equals() compares the content of strings.
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s4));
		System.out.println(s1.equals("java"));
		System.out.println("==>" + s1.equalsIgnoreCase("java"));
		System.out.println("Java".equals(s3));

		System.out.println("----------------");
		// '==': compares object references
		System.out.println(s1 == s2); // different references
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s1 == "Java");
		System.out.println("Java" == new String("Java"));
		System.out.println(new String("Java") == s2);
		System.out.println(new String("Java") == new String("Java"));
		System.out.println("Java" == "Java");
	}

	void meth2() {
		System.out.println("----meth2() called----");

		String s1 = "Java";
		System.out.println("length(): " + s1.length());
		System.out.println("s1: " + s1);
		System.out.println("==>" + s1.concat(" is awesome").length());
		System.out.println("charAt(): " + s1.charAt(0));
		System.out.println("charAt(): " + s1.charAt(s1.length() - 2)); // in string, '()' is mandatory for the length,
																		// ie length().

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your gender: ");
		char gender = sc.next().charAt(0); // only 'next' is not a method of Scanner class, add '()' for proper input.
		switch (gender) {
		case 'F', 'f':
			System.out.println("Use is female.");
			break;
		case 'M', 'm':
			System.out.println("User is male");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		sc.close();

		System.out.println("startsWith(): " + s1.startsWith("Ja"));
		System.out.println("toLowerCase(): " + s1.toLowerCase());
		System.out.println("toUpperCase(): " + s1.toUpperCase());
		System.out.println("s1: " + s1);

		String s2 = "Java is awesome";
		System.out.println("substring: " + s2.substring(8));
		System.out.println("substring: " + s2.substring(9, 11));
		System.out.println("substring: " + s2.substring(3, 11));

		String s3 = "Hello World";
		System.out.println("replace(): " + s3.replace('o', 'A'));
		System.out.println(s3.length());
		System.out.println("trim(): " + s3.trim().length());
		System.out.println("indexOf(): " + s3.indexOf('o'));
		System.out.println("lastIndexOf(): " + s3.lastIndexOf('o'));

		String date = "18-Dec-2024";
		String arr1[] = date.split("-");
		System.out.println("arr1: " + Arrays.toString(arr1));

		String msg = "I love Java";
		String arr2[] = msg.split(""); // not giving space between quotes will seperate each character.
		System.out.println("arr2: " + Arrays.toString(arr2));

		String data = "ABCDEF";
		byte arr3[] = data.getBytes(); // Converts to byte array // to be discussed later in IO Streams
		for (byte b : arr3) {
			System.out.print((char) b + " ");
		}
		System.out.println(); // for clean output
	}

	public static void main(String[] args) {
		StringEx02 aobj = new StringEx02();
		aobj.meth1();
		System.out.println("**********************************");
		aobj.meth2();
	}
}
