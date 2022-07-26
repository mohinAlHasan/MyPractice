package JavaPractice;

import java.util.Scanner;

public class VowelConst2 {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		char ch;
		System.out.print("Input any letter: ");
		ch = Sc.next().charAt(0);
		
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("Vowel");
		}
		else System.out.println("Const");
		
	}

}
