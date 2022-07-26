package JavaPractice;

import java.util.Scanner;

public class TurnaryOperator {

	public static void main(String[] args) {
		Scanner dig = new Scanner(System.in);
		int Num1, Num2, large;
		System.out.print("Input 2 numbers: ");
		Num1 = dig.nextInt();
		Num2 = dig.nextInt();
		
		large = (Num1>Num2)? Num1 : Num2;
		
		System.out.println("Large: " +large);
	}

}
