// Java code example for for each loop.

package _1_BASICS.controlstatements.iteration;

public class Ex1ForEachLoop {
	void meth1() {
		System.out.println("meth1() called.");
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println(arr[2] + " \n ");

		System.out.println("Using for loop:");
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i] + " ");
		}

		System.out.println();

		for (int i = 4; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}

		System.out.println("\nUsing for each loop: ");
		for (int x : arr) {
			System.out.println(x + " ");
		}

	}

	public static void main(String[] args) {
		Ex1ForEachLoop aobj = new Ex1ForEachLoop();
		aobj.meth1();
	}
}

/*
 * array retrieve data from array using index positions. for each loop will be
 * working on streaming date ( it does not work on index positions) so we can
 * not retrieve data in reverse order using for each loop. for each loop is only
 * used to retrieve data from array or collection classes only.
 */
