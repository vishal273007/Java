package _1_BASICS._01_pack1;

public class ClassA18 {
	
	int meth1(int num) {
		System.out.println("Hi");
		return 1+num;
	}
	
	public static void main(String[] args) {
		System.out.println(new ClassA18().meth1(99)/2);
	}

}
