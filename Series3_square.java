package JavaPractice;

import java.util.Scanner;

public class Series3_square {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n, sum=0; 
		
		System.out.print("Input n: ");
		n=Sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+"X"+i+" ");
			sum= sum+i*i;
		}
		System.out.println("\nsum: " +sum);
	}

}
