package variables_demo;

import java.util.Scanner;

public class ReadingInputFromKeyboardDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please type in two floating point numbers, separated by space: ");

		double a = scan.nextDouble();
		double b = scan.nextDouble();

		System.out.println(a+b);


		// -----------------------------------
		System.out.println("Please type in your name here: ");
		String numeUtilizator = scan.nextLine();
		System.out.println("Welcome, " + numeUtilizator);
	}

}
