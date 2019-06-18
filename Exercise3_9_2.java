package chapter_3;

import java.util.Scanner;

public class Exercise3_9_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your status");
		int status = input.nextInt();

		System.out.println("Enter your taxable income");
		double income = input.nextInt();

		double tax = 0;

		if (status == 0) {
			if (income <= 8350) {
				tax = income * 0.10;
			} else if (income <= 33950) {
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			} else if (income <= 82250) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.25;

			} else if (income <= 171550) {
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25;
			} else if (income <= 372950) {
				tax = 8350 * 0.10 + (33950 * 0.25) + (82250 * 0.25) + (171550 * 0.28) + (income * 0.33);
			} else {
				tax = 8350 * 0.10 + (33950 * 0.25) + (82250 * 0.25) + (171550 * 0.28) + (372950 * 0.33)
						+ (income * 0.35);
			}
			System.out.println("Your tax is " + (int)(tax * 100) / 100.0);
		}
	}
}
