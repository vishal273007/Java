package _2_OOPS._05_interfaces;

// Defining another interface named Ex02_InterfaceB
public interface Ex02_InterfaceB {
	// Default method with the same name as in InterfaceA
	default void meth1() {
		// This method prints a different message
		System.out.println("InterfaceB meth1() called");
	}
}
