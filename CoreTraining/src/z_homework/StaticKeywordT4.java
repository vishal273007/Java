//There will be only one copy of static variable thoughout the entire program.


package z_homework;

class StaticKeywordT4{
	static int x=10;  // x=20 after updating the x value with objectName.identifier
	
	public static void main(String[] args){
		StaticKeywordT4 t1=new StaticKeywordT4();
		StaticKeywordT4 t2=new StaticKeywordT4();
		t1.x = 20; //updating value of the static variable
		System.out.print(x + " ");
		System.out.println(t2.x);
	}
}


// my expected output: 20 10 then 10 10
// but correct output is 20 20 because once the static variable value changes, it applies throughout entire program.