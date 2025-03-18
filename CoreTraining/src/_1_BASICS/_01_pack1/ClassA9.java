package _1_BASICS._01_pack1;

public class ClassA9 {
	
	void msg() {  // main() method
		System.out.println("Message method called here.");
	}
	
	void display() {
		System.out.println("Display method called here.");
	}
	
	
	public static void main(String[] args) {
		ClassA9 aobj=new ClassA9();  // Creating an object
		aobj.msg();  // Calling a method
		aobj.display(); // Calling a method
		System.out.println("============");
		new ClassA9().msg(); // Creating and calling a method in one line
		new ClassA9().display(); // Creating and calling a method in one line
	}

}
