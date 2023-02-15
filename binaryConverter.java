/*
 * Created by Christopher Schweninger
 */
import java.util.Scanner;
public class binaryConverter {

	public static void main(String[] args) {
		//Introduction
		System.out.println("This program will accept two binary inputs of length 4, convert them to base ten, and add them together.");
		System.out.println("Please enter the first binary number. Please enter each digit one at a time.");
		//Variable calls
		int inputNum1, inputNum2, inputNum3, inputNum4, num1b10, num2b10, numTotal;
		Scanner keyboard = new Scanner(System.in);
		//Input for binary number 1
		System.out.println("First digit");
		inputNum1 = keyboard.nextInt();
		System.out.println("Second digit");
		inputNum2 = keyboard.nextInt();
		System.out.println("Third digit");
		inputNum3 = keyboard.nextInt();
		System.out.println("Fourth digit");
		inputNum4 = keyboard.nextInt();
		//Converstion & output
		num1b10 = (inputNum1 * 8) + (inputNum2 * 4) + (inputNum3 * 2) + inputNum4;
		System.out.println("You have input " +inputNum1+ +inputNum2+ +inputNum3+ +inputNum4+ " which converts to " +num1b10+ " in base 10.");
		//Input for binary number 2
		System.out.println("Please enter the second binary number. Please enter each digit one at a time.");
		System.out.println("First digit");
		inputNum1 = keyboard.nextInt();
		System.out.println("Second digit");
		inputNum2 = keyboard.nextInt();
		System.out.println("Third digit");
		inputNum3 = keyboard.nextInt();
		System.out.println("Fourth digit");
		inputNum4 = keyboard.nextInt();
		num2b10 = (inputNum1 * 8) + (inputNum2 * 4) + (inputNum3 * 2) + inputNum4;
		System.out.println("You have input " +inputNum1+ +inputNum2+ +inputNum3+ +inputNum4+ " which converts to " +num2b10+ " in base 10.");
		//Total output and closing
		numTotal = num1b10 + num2b10;
		System.out.println("The sum of adding these two binary numbers is: " +numTotal);
		System.out.println("Have a nice day!");
		
			
	}

}
