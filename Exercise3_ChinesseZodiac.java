package chapter_3;

import java.util.Scanner;

public class Exercise3_ChinesseZodiac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year to find what zodiac that year is");
		int year = input.nextInt();
		
		int zodiac = year % 12 ;
		
		switch (zodiac) {
		case 0: System.out.println("Your zodiac is monkey"); break;
		case 1: System.out.println("Your zodiac is rooster"); break;
		case 2: System.out.println("Your zodiac is dog"); break;
		case 3: System.out.println("Your zodiac is pig"); break;
		case 4: System.out.println("Your zodiac is rat"); break;
		case 5: System.out.println("Your zodiac is ox"); break;
		case 6: System.out.println("Your zodiac is tiger"); break;
		case 7: System.out.println("Your zodiac is rabbit"); break;
		case 8: System.out.println("Your zodiac is dragon"); break;
		case 9: System.out.println("Your zodiac is snake"); break;
		case 10: System.out.println("Your zodiac is horse"); break;
		case 11: System.out.println("Your zodiac is sheep" ); 
			
			break;
		}
		
	}

}
