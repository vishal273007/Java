
package com.a_starting;

import com.packages.ClassA; //1st method to import a package
//import com.packages.ClassB;

//import com.packages.*;   // 2nd method to import a package
public class ClassX{
		ClassA aobj = new ClassA();
		aobj.meth1();

		com.packages.ClassB bobj = new com.packages.ClassB(); //3rd way to import a package without using import.
		bobj.meth2();

}