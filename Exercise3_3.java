package chapter_3;

import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = input.nextInt();

		if (age < 16) {
			System.out.println("You cannot get a driver's licence");
		} else {
			System.out.println("You can get a driver's liecnce");
		}

	}

	}


