package JavaPractice;

import java.util.Scanner;

public class PositiveDemo {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int num;
		System.out.print("Input any intiger: ");
		num = Sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive");
		}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Equal to zero");
		}

	}

}
