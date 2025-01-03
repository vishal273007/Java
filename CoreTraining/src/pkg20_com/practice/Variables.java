package pkg20_com.practice;

public class Variables {

	// Instance variables to store employee details
	String empName; // Employee name
	int empSal; // Employee salary
	String empDept; // Employee department

	// Static variable shared by all instances of the class
	static String empCompany = "TCS"; // Default company name for all employees

	// Constructor to initialize employee details (name, salary, and department)
	Variables(String name, int sal, String dept) {
		empName = name; // Assign name to the empName field
		empSal = sal; // Assign salary to the empSal field
		empDept = dept; // Assign department to the empDept field
	}

	public static void main(String[] args) {
		// Creating objects (instances) of the Variables class for 3 employees
		Variables emp1 = new Variables("John", 10000, "Java");
		Variables emp2 = new Variables("Winston", 40000, "AWS");
		Variables emp3 = new Variables("Athena", 60000, "Spring");

		// Printing details of each employee using instance variables and static variable
		System.out.println(
				"emp1 details: " + emp1.empName + "  " + emp1.empSal + "  " + emp1.empDept + "  " + emp1.empCompany);
		System.out.println(
				"emp2 details: " + emp2.empName + "  " + emp2.empSal + "  " + emp2.empDept + "  " + emp2.empCompany);
		System.out.println("emp3 details: " + emp3.empName + "  " + emp3.empSal + "  " + emp3.empDept + "  "
				+ emp3.empCompany + "\n");

		// Modifying the salary of emp1 and changing the company name (empCompany is static, affects all objects)
		emp1.empSal = 95000;
		emp1.empCompany = "HCL"; // Changing the static variable will affect all instances of empCompany

		// Printing updated details for all employees
		System.out.println("emp1 details: " + emp1.empName + "  " + emp1.empSal + "  " + emp1.empDept + "  "
				+ Variables.empCompany);
		System.out.println("emp2 details: " + emp2.empName + "  " + emp2.empSal + "  " + emp2.empDept + "  "
				+ Variables.empCompany);
		System.out.println("emp3 details: " + emp3.empName + "  " + emp3.empSal + "  " + emp3.empDept + "  "
				+ Variables.empCompany);
	}
}
