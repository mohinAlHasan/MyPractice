package JavaPractice;

import java.util.Scanner;

public class InputDemo {
	
	public static void main(String[]args) {
		Scanner Sc = new Scanner(System.in);
		int num;
		int fook;
		System.out.println("Enter any number: ");
		num = Sc.nextInt();
		
		fook= num+10;
		
		System.out.println(fook);
		
	}

}
