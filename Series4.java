package JavaPractice;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n, result=1; 
		
		System.out.print("Input n: ");
		n = Sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+" ");
			result = result*i;
		}
		System.out.println("\nresult: " +result);
	}

}
