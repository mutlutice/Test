package chapter_3;

import java.util.Scanner;

public class Exercise3_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds");
		double weight = input.nextDouble();
		
		System.out.println("Enter your height in inches");
		double height = input.nextDouble();
		
		double kilograms = weight * 0.45359237;
		double inches = height * 0.0254;
		
		double BMI = kilograms / Math.pow(inches, 2);
		
	if (BMI < 18.5) {
		System.out.printf("%s%.4f", "You are underweight and your BMI is ", BMI);
	} else if (BMI < 25) {
		System.out.printf("%s%.4f", "You are normal and your BMI is ", BMI);
	} else if (BMI  < 30) {
		System.out.printf("%s%.4f", "You are overweight and your BMS is ", BMI);
	} else {
		System.out.printf("%s%.4f", "You are obese and your BMI is ", BMI);
	}
		
		
		
		
	}
	

}
