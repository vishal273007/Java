// Test frequently to ensure it works before adding more features.
// Be careful, You write a lot of spelling mistakes in the code, like missing s, n, e, etc.

package pkg20_com.practice;

import java.util.Scanner;

public class ToDoListApp {

	Scanner sc = new Scanner(System.in);

	// To show added tasks
	public void appMenu() {
		System.out.println("\nWELCOME TO THE TASK MANAGEMENT SYSTEM.");
		System.out.println("=====================================\n\n");

		System.out.println("Please choose one of the following options: \n");

		System.out.println("1. Add Task");
		System.out.println("2. Show Tasks");

		System.out.println("\nPlease enter the desired option in single digit from 1 to 2: ");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			new ToDoListApp().addTasks();
		}

//			case 2:
//				new ToDoListApp().showTasks();

	}

	// for adding tasks
	public void addTasks() {
		// Adding tasks.

		System.out.println("Please Add your task: ");

		String task1 = sc.nextLine();

		System.out.println("Task has been added successfully.\n");
		System.out.println("===================================");

		System.out.println("Choose an option: \n");
		System.out.println("1. For Adding another task.");
		int option = sc.nextInt();
		if (option == 1)
			new ToDoListApp().appMenu();

		System.out.println("Add another task");
		this.addTasks();

		System.out.println("Go to main menu");
		this.appMenu();

	}

	// for show the added tasks
	public void showTasks() {
		System.out.println("Follow are the tasks you have added: \n");
		System.out.println(name);
	}

	public static void main(String[] args) {
		ToDoListApp obj = new ToDoListApp();
		obj.appMenu();
	}

}
