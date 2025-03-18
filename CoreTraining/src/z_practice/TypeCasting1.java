/* 
 * TypeCasting - convert on datatype into another data type. 
 * Implicit typecasting converts smaller datatype in to larger datatype(ie, byte to int). Implicit typecasting is done automatically by the compiler.
 * Explicit TypeCasting conversts larger data types into smaller datatypes(ie, int to byte). Explicit typecasting is done by programmer.
 */

package z_practice;

public class TypeCasting1 {
	void implicit() {
		System.out.println("Performing Implicit Type Casting: ");
		byte b1 = 50;
		int i1 = b1;
		System.out.println("byte value b1: " + b1);
		System.out.println("int value i1: " + i1 + "\n");

		char c = 'A';
		int i2 = c;
		double d1 = c;
		System.out.println("char value c: " + c);
		System.out.println("int value i2: " + i2);
		System.out.println("double value d1: " + d1 + "\n");

		long l = 100l;
		float f = l;
		System.out.println("long value l: " + l);
		System.out.println("float value f: " + f + "\n");

	}

	void explicit() {
		System.out.println("Performing Explicit Type Casting:");
		int i1 = 100;
		byte b1 = (byte) i1;
		System.out.println("int value i1: " + i1);
		System.out.println("byte value b1: " + b1 + "\n");

		int i2 = 500;
		byte b2 = (byte) i2; // beyond byte limit, so follow below formula and then give output.
		System.out.println("int value i2: " + i2);
		System.out.println("byte value b2: " + b2);

		/*
		 * [minimum range + (result - maximumRange - 1)] -128 + (500 - 127 - 1) = 244
		 * (500 - 256 = 244) -128 + (244 - 127 - 1) = -12 (244 - 256 = -12)
		 */

		float f = 10.999f;
		byte b3 = (byte) f;
		System.out.println("float value f: " + f);
		System.out.println("byte value b3: " + b3 + "\n");

	}

	void meth1(byte b) {
		System.out.println("meth1() called: " + b);
	}

	public static void main(String[] args) {
		TypeCasting1 aobj = new TypeCasting1();
		aobj.implicit();
		System.out.println("==================================");
		aobj.explicit();
		System.out.println("===================================");
		aobj.meth1((byte) 5);
	}
}
/*
 * My expected Outputs: Performing implicit typecasting: byte value: 50 int
 * value: 50
 * 
 * char value: A int value: 65 double value: 65.0
 * 
 * long value: 100 float value: 100.0
 * ================================================ Explicit typecasting is
 * executing: int value: 100 byte value: 100
 * 
 * float value: 10.999 byte value: -12
 * ================================================== meth1() called: 5
 * 
 * 
 */