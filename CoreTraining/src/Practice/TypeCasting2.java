package Practice;

public class TypeCasting2 {
	void implicit(){ //main()
		byte b = 10;
		System.out.println("byte value is: "+b); //10
		short s = b; // s = 10
		System.out.println("short value is: "+s); //10
		s++; // s = 11
		int i = s++; // i = 11, s = 12
		System.out.println("int value is: "+i); //11
		System.out.println("short value is: "+s); //12
		
		long l = i; // 11
		System.out.println("long value is: "+(--l)); //10
		float f = l; //10
		System.out.println("float value is: "+(f + b)); // 10 + 10 = 20
		double d = (--f); // 9 
		System.out.println("double value is: "+d); //9

		show();

		if(!(d == f)){
			System.out.println("equal");
		}
		else{
			System.out.println("Not equal"); //Not equal
		}
		
	}

	public static void main(String[] args) {
		TypeCasting2 a = new TypeCasting2();
		a.implicit();
	}

	static void show() { //show() from implicit method
		char c = 'A';
		int a = ++c; // a = 65 + 1 = 66
		System.out.println(a); //66
		TypeCasting2 obj = new TypeCasting2();
		String s = obj.meth1();
		System.out.println(s); //Implicit typecasting is done by the compiler automatically
	}

	String meth1() { //show()
		String s = "Implicit typecasting is done by the compiler automatically";
		return s;
	}
}

/*
      My expected output
      10
      10
      11
      12
      10
      20 --> 20.0
      9 --> 9.0
      66
      implicit typecasting is done by the compiler
      not equal
      
 */
