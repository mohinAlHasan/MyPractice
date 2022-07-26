package JavaPractice;

import java.util.Scanner;

public class InputDemo2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		String name;
		
		System.out.print("Enter your number: ");
		name = Sc.nextLine();
		
		
		
		System.out.println("Hello " +name);
	}

}
