package chapter_3;

import java.util.Scanner;

public class Exercise3Listing3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		int right = number1 - number2;
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.println("What is " + number1 + " - " + number2 + " =?");
		int cevap = input.nextInt();
		
		if ( number1 - number2 == cevap) {
			System.out.println("You are right");
		} else {
			System.out.println("Wrong! " + number1 + " - " + number2 + " = " + right);
		}
		
 	}

}
