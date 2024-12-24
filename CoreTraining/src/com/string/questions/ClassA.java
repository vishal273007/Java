//Given a string, return a string where for every char in the original, there are two chars
//doubleChar("The") ? "TThhee"
//doubleChar("AAbb") ? "AAAAbbbb"
//doubleChar("Hi-There") ? "HHii--TThheerree"

package com.string.questions;

public class ClassA {
	public String doubleChar(String str) {
		// str = The, change to TThhee

	}

	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		String res = aobj.doubleChar("The");
		System.out.println(res);
	}
}
