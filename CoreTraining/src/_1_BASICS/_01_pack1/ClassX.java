
// This program is for package about importing from different packages and using those packages class inside current java code.

package _1_BASICS._01_pack1;

//import _1_BASICS.packages.ClassA; //1st method to import a package
//import _1_BASICS.packages.ClassB;

// 2nd method to import a package
import _1_BASICS.packages.ClassA;

public class ClassX {
	public static void main(String[] args) {
		ClassA aobj = new ClassA();
		aobj.meth1();

		_1_BASICS.packages.ClassB bobj = new _1_BASICS.packages.ClassB(); //3rd way to import a package without using import.
		bobj.meth2();
	}

}
