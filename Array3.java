package Array;

import java.util.Scanner;

public class Array3 {
	


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double[] num = new double[5];
		double sum =0;
		System.out.println("Please input 5 numbers:");
		
		num[0] = in.nextDouble();
		num[1] = in.nextDouble();
		num[2] = in.nextDouble();
		num[3] = in.nextDouble();
		num[4] = in.nextDouble();
		
		sum = num[0]+num[1]+num[4];
		System.out.println("Total: " +sum);

	}


}
