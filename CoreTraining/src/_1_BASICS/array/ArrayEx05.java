// Java program for Movie ticket booking

package _1_BASICS.array;

import java.util.Scanner;

public class ArrayEx05 {
	Scanner sc = new Scanner(System.in);

	void ticketBooking() {
		System.out.println("Which movie do you want to see?");
		String movie_Name = sc.nextLine();

		System.out.println(movie_Name + " is a nice choice.");
		System.out.println("How many tickcets you need for " + movie_Name + "?");
		String names[] = new String[Integer.parseInt(sc.nextLine())];

		System.out.println("Please enter " + names.length + " names for ticket booking");

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}

		System.out.println("Please enter row[A-Z]: ");
		String row = sc.next();

		System.out.println("Please enter starting seat number: ");
		int seat_no = sc.nextInt();

		System.out.println("\nYour tickets were booked for " + movie_Name + " below are the details: ");

		for (String data : names) {
			System.out.println(data + "-" + row + seat_no++);
		}
	}

	public static void main(String[] args) {
		ArrayEx05 aobj = new ArrayEx05();
		aobj.ticketBooking();
	}
}