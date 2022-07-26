package JavaPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input any number: ");
		int n=input.nextInt();
		int count=0;
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println("prime number");
		else System.out.println("Not prime");
		
	}

}
