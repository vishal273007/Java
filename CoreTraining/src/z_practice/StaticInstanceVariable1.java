//This java program is for instance and static variable. It shows which one retains the value and which not

package z_practice;

public class StaticInstanceVariable1{
	int x; //instance variable
	static int y; //static variable
	
	StaticInstanceVariable1(){

		x++; //0+1 = 1 x = 0, 2nd time 0+1=1 x=0, 3rd time 0+1=1 x=0
		y++; //0+1 = 1 y = 1, 2nd time 1+1=2 y=2, 3rd time 2+1=3 y=3
		System.out.println("Instance variable: "+x);
		System.out.println("Static variable: "+y);

	}

	public static void main(String[] args){
		new StaticInstanceVariable1(); // first call --> x=1, y=1
		System.out.println("--------------");
		new StaticInstanceVariable1(); //second call --> x=1, y=2
		System.out.println("---------------");
		new StaticInstanceVariable1(); // third call --> x=1, y=3
	}
}
