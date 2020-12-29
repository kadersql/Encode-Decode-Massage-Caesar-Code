package code;

import java.util.Scanner;

public class EncodeDecode {

	Scanner userInput = new Scanner(System.in);

	private final String sourceStr = "abcdefghijklmnopqrstuvwxyz;:'\",. 1234567890$%&";

	public void encodeMessage() {

		System.out.println("");
		System.out.println("Please enter message to encode");
		System.out.println("");
		String inputmessage = userInput.nextLine().toLowerCase();
		System.out.println("");
		System.out.println("Enter the KEY number (between 1 - 26)");
		System.out.println("");
		int key = userInput.nextInt();

		String encodeMessage = "";
		String encodeSourceStr = sourceStr.substring(key) + sourceStr.substring(0, key);

		for (int i = 0; i < inputmessage.length(); i++) {

			char sKey = inputmessage.charAt(i);
			int keyPosition = sourceStr.indexOf(sKey);

			encodeMessage = encodeMessage + encodeSourceStr.charAt(keyPosition);

		}
		System.out.println(encodeMessage);

	}
	
	public void decodeMessage() {

		System.out.println("");
		System.out.println("Please enter message to decode");
		System.out.println("");
		String inputmessage = userInput.nextLine().toLowerCase();
		System.out.println("");
		System.out.println("Enter the KEY number (between 1 - 26)");
		System.out.println("");
		int key = userInput.nextInt();

		String decodeMessage = "";
		String decodeSourceStr = sourceStr.substring(key) + sourceStr.substring(0, key);

		for (int i = 0; i < inputmessage.length(); i++) {

			char sKey = inputmessage.charAt(i);
			int keyPosition = decodeSourceStr.indexOf(sKey);

			decodeMessage = decodeMessage + sourceStr.charAt(keyPosition);

		}
		System.out.println(decodeMessage);

	}

}
