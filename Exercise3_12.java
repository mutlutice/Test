package chapter_3;

import java.util.Scanner;

public class Exercise3_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int count = input.nextInt();
		
		if (count % 10 == 0) {
			System.out.println("New line");
		} else {
			System.out.println("False");
		}

	}

}
