/*
 * Created by Christopher Schweninger
 */
import java.util.Scanner;
public class zodiacSignDeterminer {
	
	//I put these variable out here because the inputs are used in the input loops and again in the output, which have different embed layers.
	public static int monthInput;
	public static int dayInput;
	public static void main(String[] args) {
		//Setup
		Scanner keyboard = new Scanner(System.in);
		boolean correctInput = true;
		//Introduction
		System.out.println("This program will determine the zodiac sign based off of the inputed month and date.");
		System.out.println("You will input a month (1 through 12), enter. Then you will input a day (1 through 31), enter.");
		//Input
		while(correctInput)
		{
			
			System.out.println("Please enter the month.");
			monthInput = keyboard.nextInt();
			if(monthInput < 0 || monthInput > 12) 
			{
				System.out.println("You have inputted an incorrect input for month. Please enter a correct input for month.");
				continue;
			}
			else 
			{
				correctInput = false;
			}
		}
		System.out.println("You have inputted the month.");
		correctInput = true;
		while(correctInput)
		{
			System.out.println("Please enter the date.");
			dayInput = keyboard.nextInt();
			if(dayInput < 0 || dayInput > 31) 
			{
				System.out.println("You have inputted an incorrect input for date. Please enter a correct input for date.");
				continue;
			}
			else 
			{
				correctInput = false;
			}
		}
		//Checking for specific date improbabilities
		//I'll admit, I got lazy and didn't want to send the user back to the beginning, so I forcibly make the user do it manually by ending the program
		if((monthInput == 2 && dayInput > 29) || ((monthInput == 4) || (monthInput == 6) || (monthInput == 9) || (monthInput == 11) && dayInput > 30))
		{
			System.out.println("You have inputted a month and date combination that does not exist. Please restart the program.");
			System.exit(0);
		}
		//Output
		System.out.println("You have inputted month " +monthInput+ " and date " +dayInput);
		System.out.println("Your zodiac sign is...");
		/*This may seem long so let me simplify
		*The outer if statements select the month that was inputted starting from January (1) to December (12)
		*Then the enclosed if else statements determine which of the two possible zodiac signs it could be based off of date
		*Finally, after printing each output it ends the program
		*/
		if(monthInput == 1)
		{
			if(dayInput < 20)
			{
				System.out.println("Capricorn (December 22 to January 19)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Aquarius (January 20 to February 18)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 2)
		{
			if(dayInput < 19)
			{
				System.out.println("Aquarius (January 20 to February 18)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Pisces (February 19 to March 20)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 3)
		{
			if(dayInput < 21)
			{
				System.out.println("Pisces (February 19 to March 20)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Aries (March 21 to April 19)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 4)
		{
			if(dayInput < 20)
			{
				System.out.println("Aries (March 21 to April 19)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Taurus (April 20 to May 20)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 5)
		{
			if(dayInput < 21)
			{
				System.out.println("Taurus (April 20 to May 20)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Gemini (May 21 to June 20)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 6)
		{
			if(dayInput < 21)
			{
				System.out.println("Gemini (May 21 to June 20)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Cancer (June 21 to July 22");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 7)
		{
			if(dayInput < 23)
			{
				System.out.println("Cancer (June 21 to July 22");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Leo (July 23 to August 22)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 8)
		{
			if(dayInput < 23)
			{
				System.out.println("Leo (July 23 to August 22)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Virgo (August 23 to September 22)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 9)
		{
			if(dayInput < 23)
			{
				System.out.println("Virgo (August 23 to September 22)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Libra (September 23 to October 22)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 10)
		{
			if(dayInput < 23)
			{
				System.out.println("Libra (September 23 to October 22)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Scorpio (October 23 to November 21)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 11)
		{
			if(dayInput < 22)
			{
				System.out.println("Scorpio (October 23 to November 21)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Sagittarius (November 22 to December 21)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		else if(monthInput == 12)
		{
			if(dayInput < 22)
			{
				System.out.println("Sagittarius (November 22 to December 21)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("Capricorn (December 22 to January 19)");
				System.out.println("Have a nice day!");
				System.exit(0);
			}
		}
		

	}

}
