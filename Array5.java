package Array;

import java.util.Scanner;

public class Array5 {


	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		double[] num = new double[5];
		double sum =0;
		System.out.println("Please input 5 numbers:");
		
		for(int j=0; j<num.length; j++){
			num[j] = input.nextDouble();
		}
		for(int j=0; j<num.length; j++) {
			sum = sum+num[j];
		}
		System.out.println("Sum: " +sum);
	}

}
