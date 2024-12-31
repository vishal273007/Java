package com.oopsconcept.inheritance;

public class ClassB5 extends ClassA5 {

}

/*
	In these above tow classes ClassA5 and ClassB5, we will be getting error in classB, because in classsB as we are not writing any constructors, by default compiler will be adding a default constructorto our program.
	
	In that default constructor, the first statement is super();
	
	with the help of super() call, compiler is trying to call classA default contructor which is not available. That is the reasonwe are getting an error.
	
	
	NOTE:  inside a constructor, we cannot write both super() and this() simultaneosly because both should be the first statement inside a constructor.
*/