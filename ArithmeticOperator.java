package JavaPractice;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		double num1, num2, result;
		
		System.out.print("Input first num: ");
		num1 = Sc.nextDouble();
		System.out.print("Input second num: ");
		num2 = Sc.nextDouble();
		
		result= num1 + num2;
		System.out.println("\nAddition: " +result);
		result= num1 - num2;
		System.out.println("Subtraction: " +result);
		result= num1 * num2;
		System.out.println("Multipication: " +result);	
	    result= num1 / num2;
	    System.out.println("Division: " +result);	
	    result= num1 % num2;
	    System.out.println("Reminder: " +result);
	    
	}

}
