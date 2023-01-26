package Calculator;

import java.util.Scanner;

public class WithDouble {

	public static void main(String[] args) {
		// To get the input from user we're using Scanner class
		// for storing the user's input we assign variable "scanner" & get input from the terminal we use "System.in"
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		double firstnumber = scanner.nextDouble();
		
		System.out.println("Enter Second Number: ");
		double secondnumber =  scanner.nextDouble();
		
		double answer = firstnumber + secondnumber;
		System.out.println("Sum is: " + answer);

}

}
