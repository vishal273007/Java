//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//
//extraEnd("Hello") ? "lololo"
//extraEnd("ab") ? "ababab"
//extraEnd("Hi") ? "HiHiHi"

package com.string.questions;

public class StringEx04 {

	public String extraEnd(String str) {
		// str = hello
		String s = str.substring(str.length() - 2); // need to brush up the topic well. Why wasn't this idea coming up
													// idea despite already have solved?
		return s + s + s;
	}

	public static void main(String[] args) {
		StringEx04 aobj = new StringEx04();
		String result = aobj.extraEnd("hello");
		System.out.println(result);
	}

}
