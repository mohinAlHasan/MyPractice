package JavaPractice;

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		

		Scanner Sc = new Scanner(System.in);
		double base, hight, area;
		
		System.out.print("Input Base: ");
	    base = Sc.nextDouble();
		System.out.print("Input Hight: ");
	    hight = Sc.nextDouble();
	    
	    area = 0.5*base*hight;
	    
	    System.out.println("Area of Triangle: " +area + " Sq. Unit");
		

	}

}
