//A static block will alway be executed before main()

package z_homework;

public class StaticKeywordT2{
	int x=10;
	public static void main(String[] args){
		int x=20;
		System.out.println(x);
	}

	static{
		int x=30;
		System.out.print(x + " ");
	}
}

//Expected output:
//	30 20