package Array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		System.out.println("Please input array length:");
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
		
        double[] num = new double[val];
		double sum =0;
		System.out.println("Please input numbers:");
		
		for(int j=0; j<val; j++){
			num[j] = input.nextDouble();
		}
		for(int j=0; j<val; j++) {
			sum = sum+num[j];
		}
		System.out.println("Sum: " +sum);

	}

}
