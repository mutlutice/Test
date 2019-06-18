package chapter_3;

import java.util.Scanner;

public class Exercise3_Case {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int day = input.nextInt();

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("It is a weekday");

			break;
		case 0:
		case 6:
			System.out.println("It is weekend");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
	}

}
