package chapter_3;

import java.util.Scanner;

public class Exercise3_24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter three different integers");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
	}

}
