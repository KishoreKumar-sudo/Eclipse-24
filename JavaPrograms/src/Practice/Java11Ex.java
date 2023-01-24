package Practice;

import java.util.Scanner;

public class Java11Ex {
	public static void main(String[] args) {
		int marksobtained, passingmarks;
		char grade;
		passingmarks =45;

		Scanner input = new Scanner(System.in);
		System.out.println("Input Marks scored by you");
		marksobtained = input.nextInt();

		if (marksobtained >= passingmarks) {
			if (marksobtained > 100)
				grade = 'A';
			else if (marksobtained > 85)
				grade = 'B';
			else if (marksobtained > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You Passed the exam and your grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("You Failed and your grade is " + grade);
		}
	}
}
