package JavaPractice;

import java.util.Scanner;

public class TemperatureConvertor2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		double cels, cels2, cels3, farn;
		
		System.out.print("Farn: ");
		farn = Sc.nextDouble();
		
		cels = farn - 32;
		cels2 = cels*5;
		cels3 = cels2/9;
		
		System.out.println("Cels: " +cels3);
		
	}

}
