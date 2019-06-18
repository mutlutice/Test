package chapter_3;

import java.util.Scanner;

public class Exercise3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int x = input.nextInt();
		
		if (x >= 50 && x <= 100) {
			System.out.println(x);
		}
	
	}

}
