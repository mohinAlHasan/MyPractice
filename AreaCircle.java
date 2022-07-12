package JavaPractice;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		double radius, area;
		
		System.out.print("Input Radius: ");
	    radius = Sc.nextDouble();
		
	    
	    area = 3.1416*radius*radius;
	    
	    System.out.println("Area of circle: " +area + " Sq. Unit");
		

	}

}
