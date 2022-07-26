package Array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		
		System.out.println("Please input array number: ");
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
		
		double avg = sum/val;
		System.out.println("Avg: " +avg);
		
		double max = num[0];
		for(int j=1; j<val; j++) {
			if(max<num[j])
			{
				max = num[j];
			}
						
		}
		System.out.println("Max: " +max);
		
		
		double min = num[0];
		for(int j=1; j<val; j++) {
			if(min>num[j])
			{
				min = num[j];
			}
						
		}
		System.out.println("min: " +min);


	}

}
