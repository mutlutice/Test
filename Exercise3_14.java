package chapter_3;

import java.util.Scanner;

public class Exercise3_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} if (number % 5 == 0) {
			System.out.println(number + " is multiple of 5");
		}
		
				

	}

}
