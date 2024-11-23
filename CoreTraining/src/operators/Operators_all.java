package operators;

public class Operators_all {
	
	
	void meth1() {
		int a=10, b=5;
		
		//Arithmetic Operators
		int sum = a+b;
		int difference = a-b;
		int product = a*b;
		int quotient = a/b;
		int remainder = a%b;
		
		//Relational Operators
		boolean isEqual = a == b;
		boolean isNotEqual = a != b;
		boolean isGreaterThan = a > b;
		boolean isLessThan = a < b;
		boolean isGreaterThanOrEqual = a >= b;
		boolean isLessThanOrEqual = a <= b;
		
		//Logical Operators
		boolean logicalAnd = (a > 0) && (b < 10);
		boolean logicalOr = (a < 0) || (b > 10);
		boolean logicalNotA = !(a > 0);
		boolean logicalNotB = !(b < 10);
		
		//Increment/Decrement Operators
		int preIncrement = ++a; //11 , a=11
		int postIncrement = b++; //5, b=6
		int preDecrement = --a; //10, a=10
		int postDecrement = b--; //6, b=5
		
		System.out.println("Arithmetic Operator: \n");
		System.out.println("sum: "+sum); //15 --> ✓
		System.out.println("difference: "+difference); //5 --> ✓
		System.out.println("product: "+product); //50 --> ✓
		System.out.println("quotient: "+quotient); //2 --> ✓
		System.out.println("remainder: "+remainder); //0 --> ✓
		
		System.out.println("\nRelational Operator: \n");
		System.out.println("Is Equal: "+isEqual); //False --> ✓
		System.out.println("Is NOT Equal: "+isNotEqual); //True --> ✓
		System.out.println("Is Greater Than: "+isGreaterThan); //True --> ✓
		System.out.println("Is Less Than: "+isLessThan); //False --> ✓
		System.out.println("Is Greater Than or Equal: "+isGreaterThanOrEqual); //True --> ✓
		System.out.println("Is Less Than or Equals: "+isLessThanOrEqual); //False --> ✓
		
		System.out.println("\nLogical Operators: \n");
		System.out.println("Logical AND: "+logicalAnd); //True --> ✓
		System.out.println("Logical OR: "+logicalOr); //False --> ✓
		System.out.println("Logical NOT A: "+logicalNotA); //False --> ✓
		System.out.println("Logical NOT B: "+logicalNotB); //False --> ✓
		
		System.out.println("\nIncrement/Decrement Operators: \n");
		System.out.println("Pre Increment: "+preIncrement); //11 --> ✓
		System.out.println("Post Increment: "+postIncrement); //5 --> ✓
		System.out.println("Pre Decrement: "+preDecrement); //9 NOT but --> 10, see variable calculation for explanation.
		System.out.println("Post Decrement: "+postDecrement +"\n"); //5 NOT but --> 6, see variable calculation for explanation.
		
	    }
		
		
		
		void meth2() {
			int a=10;
			int b=5;
			
			//Assignment Operators:
			int equalAssignment = a; //a=10
			int additionAssignment = a += b; //[a=15] //a=a+b
			int subtractionAssignment = a -= b; //a=15-5 = 10 --> [a=10] //a=a-b
			int multiplicationAssignment = a *= b; //a=10*5=50 --> [a=50] //a=a*b
			int divisionAssignment = a /= b; //a=50/5=10 --> [a=10] //a=a/b
			
			System.out.println("\nEqual Assignment: "+equalAssignment); //10 ✓
			System.out.println("Addition Assignment: "+additionAssignment); //15 ✓
			System.out.println("Subraction Assignment: "+subtractionAssignment); //5 not but --> 10, see variables calculation for explanation
			System.out.println("Multiplication Assignment: "+multiplicationAssignment); //50 --> 50 but with calculation
			System.out.println("Division Assignment: "+divisionAssignment); //2 NOT but --> 10, see variable calculation for explanation
						
		}
		

		
		public static void main(String[] main) {
			Operators_all aobj=new Operators_all();
			aobj.meth1();
			System.out.println("--------------------------");
			aobj.meth2();
		}
				
		
}
