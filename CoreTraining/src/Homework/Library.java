package Homework;

public class Library {

	//-------------- borrowBook Method--------------------

	public void addBook(String title) {

		String[] bookName = new String[5];

	}

	public void addBook(String title, String author) {

	}

	//-------------- borrowBook Method--------------------

	public void borrowBook(String title) {

	}

	public void borrowBook(String title, String borrower) {

	}

	//-------------- returnBook Method--------------------

	public void returnBook(String title) {

	}

	//-------------- displayAvailableBooks Method--------------------

	public void displayAvailableBooks(String title) {

	}

	//-------------- main Method--------------------

	public static void main(String[] args) {
		Library obj = new Library();
		obj.addBook("Harry Potter");
		obj.addBook("Harry Potter", "JK Rowlings");

		obj.borrowBook("Harry Potter");
		obj.borrowBook("Harry Potter", "Vishal");

		obj.returnBook("Harry Potter");

		obj.displayAvailableBooks("Harry Potter");
	}

}
