package chapter_3;

import java.util.Scanner;

public class Exercise3_32 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = input.nextInt();
		
		switch (number) {
		case 1: System.out.println("The day is monday"); break;
		case 2: System.out.println("The day is tuesday"); break;
		case 3: System.out.println("The day is wednesday"); break;
		case 4: System.out.println("The day is thursday"); break;
		case 5: System.out.println("The day is friday"); break;
		case 6: System.out.println("The day is saturday"); break;
		case 0: System.out.println("The day is sunday"); break;
			
			default:
				System.out.println("Choose a smaller number");

		break;
		}
	}

}
