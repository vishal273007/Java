// if else program to check if a character is in small letter or in capital letter.

package controlstatements.IfElseExamples;

public class CaseCheck {
	void caseCheck(char ch) {
		if ((ch >= 'a') && (ch <= 'z')) {
			System.out.println(ch + " is in small letter.");
		}

		else if ((ch >= 'A') && (ch <= 'Z')) {
			System.out.println(ch + " is in capital letter.");
		}

		else {
			System.out.println("Not a valid character.");
		}
	}

	public static void main(String[] args) {
		CaseCheck check = new CaseCheck();
		check.caseCheck('b');
	}
}
