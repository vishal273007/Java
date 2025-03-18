package _2_OOPS._02_encapsulation;

public class ClassA {
	private String empName;
//	String empName;
	private int empSal;
//	int empSal;
	private String empDept;

//	String empDept;

	// ---------------------------------------------------------
	// System generated with "alt + shift + s" then select method names.

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	// ----------------------------------------------------------
	// written by me error = I had to give it public, not private.

//	private String getEmpName() {
//		return empName;
//	}
//	
//	private void setEmpName(String empName) {
//		this.empName = empName;
//	}
//	
//	private int getEmpSal() {
//		return empSal;
//	}
//	
//	private void setEmpSal(int empSal) {
//		this.empSal = empSal;
//	}
//	
//	private String getEmpDept() {
//		return empDept;
//	}
//	
//	private void setEmpDept(String empDept) {
//		this.empDept = empDept;
//	}
}
