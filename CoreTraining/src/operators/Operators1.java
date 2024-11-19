package operators;

public class Operators1 {
	
	void meth1() {
		int a=1;
		int b=2;
		int c;
		int d;
		c=++b; //c=3 b=3 [first b value increased due to PreIncrement then it's value assigned to variable c]
		d=a++; //d=1 a=2 [first a value is assigned to d then a value increased by 1]
		c++; //c=4
		
		System.out.println("a = "+a); //2
		System.out.println("b = "+b); //3
		System.out.println("c = "+c); //4
		System.out.println("d = "+d); //1
	}
	
	public static void main(String[] args) {
		Operators1 aobj=new Operators1();
		aobj.meth1();
	}

}
