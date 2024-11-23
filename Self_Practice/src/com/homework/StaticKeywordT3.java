//We can not call a instance variable in static method with a Class name. We can call the static variable with it's class object.

package com.homework;

public class StaticKeywordT3{
	int x=10;
	
	public static void main(String[] args){
//		System.out.println(StaticKeywordT3.x); // calling with class name to an instance variable is incorrect
		System.out.println(new StaticKeywordT3().x);
	}

	static{
		int x=30;
		System.out.print(x + " ");
	}
}
