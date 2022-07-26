package JavaPractice;

import java.util.Scanner;

public class CapitalSmall {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		char ch;
		System.out.print("Input any letter: ");
		ch = Sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("Small Letter");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("Capital Letter");
		}
		else System.out.println("Not letter");
	}

}
