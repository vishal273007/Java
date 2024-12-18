// Java program to check the grading of the marks of student.

package com.controlstatements.IfElseExamples;

public class Grading {

	void grading(int mark) {
		if (mark < 25) {
			System.out.println("Your grade is: F");
		}

		else if ((mark >= 25) && (mark < 45)) {
			System.out.println("Your grade is: E");
		}

		else if ((mark >= 50) && (mark < 60)) {
			System.out.println("Your grade is: D");
		}

		else if ((mark >= 60) && (mark < 70)) {
			System.out.println("Your grade is: C");
		}

		else if ((mark >= 70) && (mark <= 70)) {
			System.out.println("Your grade is: B");
		}

		else
			System.out.println("Your grade is: A");
	}

	public static void main(String[] args) {
		Grading grad = new Grading();
		grad.grading(80);
		grad.grading(44);
	}
}
