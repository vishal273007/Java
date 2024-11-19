package constructors;

public class ClassCons2 {
	public ClassCons2() {
		System.out.println("Sunday");
		ClassCons2 aobj=new ClassCons2(10);
		System.out.println("Tuesday");
		String s=aobj.display("Challenge Accepted");
		System.out.println(s);
	}
	
	public ClassCons2(int temp) {
		System.out.println("Saturday");
		ClassCons2 aobj=new ClassCons2(10,20);
		int a=aobj.meth1()+temp;
		System.out.println("===>"+(a+aobj.meth2()));
		System.out.println("Monday");
	}
	
	String display(String s) {
		System.out.println("In the next I am returning string value");
		return s;
	}
	
	int meth1() {
		return 100;
	}
	
	int meth2() {
		return 99;
	}
	
	public ClassCons2(int data, int temp) {
		System.out.println("Thursday");
		System.out.println("===>"+(data+new ClassCons2("HI").meth2()));
	}
	
	ClassCons2(String s){
		System.out.println(s);
	}
	
	public static void main(String [] args) {
		ClassCons2 aobj=new ClassCons2();
		System.out.println("Output Verified");
	}
	

}
