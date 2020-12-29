package app;

import java.util.Scanner;

import code.EncodeDecode;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EncodeDecode encodeDecode = new EncodeDecode();
		
		System.out.println("*************************************");
		System.out.println("Welcome");
		System.out.println("");
		System.out.println("Please Choose an option");
		System.out.println("");
		System.out.println("1.  Encode a massage");
		System.out.println("");
		System.out.println("2.  Decode a massage");
		System.out.println("*************************************");
		System.out.println("");
		int userChoice = input.nextInt();
		
		if (userChoice == 1) {
			
			encodeDecode.encodeMessage();
			
		}else if (userChoice == 2) {
			
			encodeDecode.decodeMessage();
		}else {
			System.out.println("invalid choice");
		}
		
	}

}
