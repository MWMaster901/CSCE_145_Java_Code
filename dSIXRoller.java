/*
 * Created by Christopher Schweninger
 */
import java.util.Scanner;
import java.util.Random;
public class dSIXRoller {

	public static int oneRolls;
	public static int twoRolls;
	public static int threeRolls;
	public static int fourRolls;
	public static int fiveRolls;
	public static int sixRolls;
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will roll a d6 (six sided dice) a number of inputted times.");
		System.out.println("Please input an amount of times you would like the dice to be rolled (positive integer).");
		int rollTimes = keyboard.nextInt();
		oneRolls = 0;
		twoRolls = 0;
		threeRolls = 0;
		fourRolls = 0;
		fiveRolls = 0;
		sixRolls = 0;
		if(rollTimes <= 0)
		{
			System.out.println("You have inputed a non-positive integer. Program will end.");
			System.exit(0);
		}
		int i = 0;
		do 
			{
			int diceRoll = rand.nextInt(6);
			diceRoll++;
			if(diceRoll == 1) {
				oneRolls++;
			} else if(diceRoll == 2) {
				twoRolls++;
			} else if(diceRoll == 3) {
				threeRolls++;
			} else if(diceRoll == 4) {
				fourRolls++;
			} else if(diceRoll == 5) {
				fiveRolls++;
			} else if(diceRoll == 6) {
				sixRolls++;
			}
			System.out.println(diceRoll+ " was rolled");
			i++;
			}
		while(rollTimes > i);
		System.out.println("One was rolled " +oneRolls+ " times.");
		System.out.println("Two was rolled " +twoRolls+ " times.");
		System.out.println("Three was rolled " +threeRolls+ " times.");
		System.out.println("Four was rolled " +fourRolls+ " times.");
		System.out.println("Five was rolled " +fiveRolls+ " times.");
		System.out.println("Six was rolled " +sixRolls+ " times.");
		System.out.println("Have a nice day!");
	}

}
