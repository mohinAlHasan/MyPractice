package JavaPractice;

import java.util.Scanner;

public class Series03 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		double n, sum=0; 
		
		System.out.print("Input n: ");
		n=Sc.nextDouble();
		
		for(double i=1.5; i<=n; i++) {
			System.out.print(i+" ");
			sum= sum+i;
		}
		System.out.println("\nsum: " +sum);
	}

}
