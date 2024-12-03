
// Java program to find factorial of a given number. Your logic building is completely shit, it's
// not because your brain is of lizard, instead, it's because you don't practice by yourself.

package controlstatements.iteration;

public class Ex5FactorialProgram {

	void meth1(int x) {
		int fact = 1;
		for (; x >= 1; x--) {
			fact = fact * x;
		}

		System.out.println("Factoral: " + fact);
	}

	public static void main(String[] args) {
		Ex5FactorialProgram aobj = new Ex5FactorialProgram();
		aobj.meth1(5);
	}
}
