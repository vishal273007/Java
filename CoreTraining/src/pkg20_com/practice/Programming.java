package pkg20_com.practice;

public class Programming {
	
	public void meth1() {
		System.out.println("I love Programming Languages.");
	}
	
	void meth2(String s){
		System.out.println("I love "+s);
		
	}
	
	public static void main(String [] args) {
		Programming aobj=new Programming();
		aobj.meth1();
		
		new Programming().meth2("Java");
	}

}
