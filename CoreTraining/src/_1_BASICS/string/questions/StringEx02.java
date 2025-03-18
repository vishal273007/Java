//
//Given two strings, a and b, return the result of putting them together in the order ab-ba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
//
//makeAbba("Hi", "Bye") ? "HiByeByeHi"
//makeAbba("Yo", "Alice") ? "YoAliceAliceYo"
//makeAbba("What", "Up") ? "WhatUpUpWhat"

package _1_BASICS.string.questions;

public class StringEx02 {
	public String makeAbba(String a, String b) {
		// a = Hi, b = Bye
		return a + b + b + a;
	}

	public static void main(String[] args) {
		StringEx02 aobj = new StringEx02();
		String result = aobj.makeAbba("Hi", "Bye");
		System.out.println(result);
	}
}