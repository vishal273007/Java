package _3_AFTEROOPS._09_finalkeyword;

public final class ClassA {
	final int i = 10; // constant

	final void meth1() { // can be inherited but cannot be overide
		//System.out.println(i++);
		System.out.println("meth1() called");
	}
}

// private methods: we can't inherit so we can not override
// final methods: we can inherit but we cannot override

// Question: Difference between final, finally, and finalize()
