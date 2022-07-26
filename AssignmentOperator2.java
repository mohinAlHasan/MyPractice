package JavaPractice;

import java.util.Scanner;

public class AssignmentOperator2 {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		double x,y;
		
		System.out.print("Input first N1: ");
		x = Sc.nextDouble();
		System.out.print("Input second N2: ");
		y = Sc.nextDouble();
		

		x += y; // x = x+y = 5
		System.out.println("x: " +x);
		x -= y; // x = x-y = 1
		System.out.println("x: " +x);
		x *= y; // x = x*y = 6
		System.out.println("x: " +x);
		x /= y; // x = x/y = 3
		System.out.println("x: " +x);
		x %= y; // x = x%y = 1
		System.out.println("x: " +x);

	}

}
