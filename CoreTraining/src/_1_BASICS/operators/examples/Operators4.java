package _1_BASICS.operators.examples;

public class Operators4 {
	
	void meth1() {
		int x=10;
		System.out.println("Before x: "+x); //10
		x=x++; //x=10 [When the variables are on both sides then ignore the increment in single expression]		
		System.out.println("After x: "+x + "\n"); //10
		
		int y=20;
		System.out.println("Before y: "+y); //20		
		int z=y++; //z=20  y=21 [first y value will be assigned to z and then y value will be increased by 1]		
		System.out.println("After y: "+y); //21
		System.out.println("z value: "+z+"\n"); //20
		
		int i=50;
		System.out.println("Before i: "+i); //50
		i=i++ + ++i; //i=50+52 = 102 [in the first expression, same value will be there and then increased by 1, then in second Preincrement the increased value will be increased]
		System.out.println("After i: "+i +"\n"); //102
		
		int k=100;
		System.out.println("Before K: "+k); //100
		k=k++ +10; //k=100 + 10 = 110 [in the first expression, k value will be same due to post increment and then k value will be increased by 1 for later use.]
		System.out.println("After k: "+k+"\n"); //110
		
		int m=100;
		System.out.println("Before m: "+m); //100
		m=++m +10; //m=101+10 == 111 [in the first expression, the value of m will be increased first and then it will be added with second expression.]
		System.out.println("After m: "+m+"\n"); //111
		
		System.out.println("sum: "+(x+y+z+i+k+m)); // 10 + 21 + 20 + 102 + 110 + 111 = 374
		
		
	}
	
	public static void main(String[] args) {
		Operators4 aobj=new Operators4();  //Creating an object
		aobj.meth1(); //Calling an object with the help of object reference name
	}

}
