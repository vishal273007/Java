//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//helloName("Bob") ? "Hello Bob!"
//helloName("Alice") ? "Hello Alice!"
//helloName("X") ? "Hello X!"

package com.string.questions;

public class StringEx01 {
	public String helloName(String name) {
		// return "Hello " + name + "!";
		return "Hello " + name.concat("!");
	}

	public static void main(String[] args) {
		StringEx01 aobj = new StringEx01();
		String result = aobj.helloName("Bob");
		System.out.println(result);
	}
}
