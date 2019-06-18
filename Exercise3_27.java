package chapter_3;

import java.util.Scanner;

public class Exercise3_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight and height");
		int weight = input.nextInt();
		int height = input.nextInt();
		
		System.out.println("Your input is " + (weight > 50 && height > 60));
	}

}
