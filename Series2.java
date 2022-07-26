package JavaPractice;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n, sum=0; 
		
		System.out.print("Input n: ");
		n=Sc.nextInt();
		
		for(int i=2; i<=n; i=i+2) {
			System.out.print(i+" ");
			sum= sum+i;
		}
		System.out.println("\nsum: " +sum);
	}

}
