package JavaPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum=0; 
		
		System.out.print("Input n: ");
		num = input.nextInt();
		int i=1;
		
		while(i<=num)
		{
			int fact=1;
			int j=1;
			while(j<=i) {
				fact = fact*j;
				j++;
			}
			sum = sum+fact;
			i++;
		}
		
		System.out.println(sum);

	}

}
