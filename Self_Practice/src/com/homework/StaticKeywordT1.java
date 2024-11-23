package com.homework;

class StaticKeywordT1 {
	public static void main(String[] args) {
		int x = 20;
		System.out.println(x);
	}

	static {
		int x = 10;
		System.out.print(x + " ");
	}
}