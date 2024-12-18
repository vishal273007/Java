package Homework;

public class ThisKeywordEx05 {
	String name;

	ThisKeywordEx05() { // main(), automatically called with creating an object
		this("Abdul Kalam sir"); // same as "new Person("Abdul Kalam sir")
		this.display(); // same as "new Person().display()"
	}

	ThisKeywordEx05(String name) { // this(), name = Abdul kalam sir
		this.name = name; // similar to the string name in bracket and this() keyword in meth1().
	}

	void display() {
		System.out.println("Person name is :" + " " + name);
	}

	public static void main(String[] args) {
		ThisKeywordEx05 p = new ThisKeywordEx05(); // creating an object
	}
}
