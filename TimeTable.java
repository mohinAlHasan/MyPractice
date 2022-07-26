package JavaPractice;

import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Input any number: ");
		n=input.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" X "+i +" = "+n*i);
		}
	}

}
