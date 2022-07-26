package JavaPractice;

import java.util.Scanner;

public class TimeTable_nestedLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		System.out.print("Input initial number: ");
		n=input.nextInt();
		
		System.out.print("Input final number: ");
		m=input.nextInt();
		
		for(int i=n; i<=m; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i+" X "+j +" = "+i*j);
				
			}
			System.out.println();
		} 
	}

}
