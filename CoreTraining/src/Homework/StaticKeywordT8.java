//Write the code anyhow, e.g. write yourself or copy and paste on the editor then finally use format with Ctrl+Shift+F at the last to make the code look ligible.

//A constructor will be called automatically as many numbers of object is created in the program.

package Homework;

public class StaticKeywordT8 {
	int c;
	static int e;

	StaticKeywordT8() {
		System.out.println(++c);
		System.out.println(++e);
	}

	public static void main(String[] args) {
		int a = 34;
		int b = 21;
		new StaticKeywordT8().c -= a++ + ++b;
		int d = --a + --b + new StaticKeywordT8().c--;
		e = a + +b + new StaticKeywordT8().c + d--;
		int f = -a + b-- + -new StaticKeywordT8().c - d++;
		int sum = a + b + new StaticKeywordT8().c + d + e + f;
		System.out.println("Sum: " + sum);
	}
}

//My expected output: 
//	1
//	1
//	39

//Finally as always, I am always wrong at new concept.