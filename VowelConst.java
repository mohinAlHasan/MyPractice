package JavaPractice;

import java.util.Scanner;

public class VowelConst {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		char ch;
		System.out.print("Input any letter: ");
		ch = Sc.next().charAt(0);
		
		if(ch=='a') {
			System.out.println("Vowel");
		}
		else if(ch=='e') {
			System.out.println("Vowel");
		}
		else if(ch=='i') {
			System.out.println("Vowel");
		}
		else if(ch=='o') {
			System.out.println("Vowel");
		}
		else if(ch=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Const");
		}

	}

}
