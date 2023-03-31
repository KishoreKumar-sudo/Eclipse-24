package Practice;

import java.util.Scanner;

//Find all Substrings of string
public class Ex29 {

	public static void main(String[] args) {
		String string, sub;
		int i, c, length;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to point it's all substrings");
		string = in.nextLine();
		length = string.length();
		System.out.println("Substrings of \"" + string + "\" are :-");
		for (c = 0; c < length; c++) {
			for (i = 1; i <= length - c; c++) {
				sub = string.substring(c, c + i);
				System.out.println(sub);
			}
		}
	}

}
