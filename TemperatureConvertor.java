package JavaPractice;

import java.util.Scanner;

public class TemperatureConvertor {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		double cels, farn;
		
		System.out.print("Celsius: ");
		cels = Sc.nextDouble();
		
		farn = 1.8 * cels + 32;
		
		System.out.println("Farn: " +farn);
		
		
	}

}
