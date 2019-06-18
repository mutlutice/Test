package chapter_3;

import java.util.Scanner;

public class Exercise3_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		
		System.out.println("Your age is " + (age > 13 && age < 18));
	}

}
