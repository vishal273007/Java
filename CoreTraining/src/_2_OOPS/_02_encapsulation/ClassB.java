package _2_OOPS._02_encapsulation;

import java.util.Scanner;

public class ClassB {
	void meth1() {
		Scanner sc = new Scanner(System.in);

		ClassA aobj = new ClassA();

		System.out.println("Enter your name: ");

		// aobj.empName = sc.next();
		aobj.setEmpName(sc.next());

		System.out.println("Enter your salary: ");
		// aobj.empSal = sc.nextInt();
		aobj.setEmpSal(sc.nextInt());

		System.out.println("Enter your department: ");
		// aobj.empDept = sc.next();
		aobj.setEmpDept(sc.next());

		sc.close();

		System.out.println("Emp Details: ");

		System.out.println("Employee name: " + aobj.getEmpName());
		System.out.println("Employee salary: " + aobj.getEmpSal());
		System.out.println("Employee department: " + aobj.getEmpDept());
	}

	public static void main(String[] args) {
		ClassB bobj = new ClassB();
		bobj.meth1();
	}
}