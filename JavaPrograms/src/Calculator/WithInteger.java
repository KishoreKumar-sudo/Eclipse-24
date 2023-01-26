package Calculator;

import java.util.Scanner;

public class WithInteger {

	public static void main(String[] args) {
		// To get the input from user we're using Scanner class
		// for storing the user's input we assign variable "scanner" & get input from
		// the terminal we use "System.in"
		Scanner scanner = new Scanner(System.in);

		// for displaying the user's age in the terminal
		int age = scanner.nextInt();
		System.out.println("Your Age is: " + age);
	}

}
