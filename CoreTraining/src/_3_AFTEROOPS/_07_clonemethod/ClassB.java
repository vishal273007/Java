// java program for clone method. 

package _3_AFTEROOPS._07_clonemethod;

public class ClassB implements Cloneable { // ClassB implements Cloneable interface to allow cloning
	int x = 111; // Instance variable x
	int y = 222; // Instance variable y

	// Method to create a clone of the current object
	ClassB createClone() throws CloneNotSupportedException {
		// Calls the clone() method from the Object class and casts it to ClassB
		ClassB obj = (ClassB) super.clone();
		return obj; // Returns the cloned object
	}
}
