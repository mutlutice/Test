package chapter_3;

import java.util.Scanner;

public class ExerciseLotteryPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lottery = (int) (Math.random() * 100);

		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;

		System.out.println("Pick your lottery number (two digits");
		int guess = input.nextInt();

		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);

		if (guess == lottery) {
			System.out.println("Exact match: you win $10000");
		} else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
			System.out.println("Match all the digits; you win 3000");
		} else if (guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1) {
			System.out.println("You have one digit match: you win 1000");

		} else {

			System.out.println("You have no match. You did not win");

			{

			}
		}
	}
}
