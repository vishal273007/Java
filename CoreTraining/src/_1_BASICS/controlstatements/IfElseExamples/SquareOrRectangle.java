// if-else program to check if the given length and breadth is square or rectangle.

package _1_BASICS.controlstatements.IfElseExamples;

public class SquareOrRectangle {
	void meth1(int l, int b) {
		if (l == b) {
			System.out.println("Square.");
		} else {
			System.out.println("Rectangle.");
		}
	}

	public static void main(String[] args) {
		SquareOrRectangle aobj = new SquareOrRectangle();
		aobj.meth1(7, 7);
		aobj.meth1(5, 6);
	}
}
