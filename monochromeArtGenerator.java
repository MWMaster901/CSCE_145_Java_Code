/*
 * Created by Christopher Schweninger
 */
import java.util.Scanner;
import java.util.Random;

public class monochromeArtGenerator {
	//Initial setup of the array
	public static char[][]artArray;

	public static void main(String[] args) {
		//Initial setup of variables
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int tempIntInput, arrayLength, arrayHeight, randomValue, masterpieceNumber;
		masterpieceNumber = 0;
		String tempStringInput;
		System.out.println("This program with generate random binary-monochrome art based on inputted size.");
		System.out.println("Please input the size of the art.");
		//Input and error net for length
		System.out.print("Length: ");
		tempIntInput = keyboard.nextInt();
		if(tempIntInput <= 0)
		{
			System.out.println("ERROR, INPUT IS A NON-POSITIVE VALUE. EXITING PROGRAM");
			System.exit(0);
		}
		arrayLength = tempIntInput;

		//Essentially a repeat of Length, but for Height
		System.out.print("Height: ");
		tempIntInput = keyboard.nextInt();
		if(tempIntInput <= 0)
		{
			System.out.println("ERROR, INPUT IS A NON-POSITIVE VALUE. EXITING PROGRAM.");
			System.exit(0);
		}
		arrayHeight = tempIntInput;

		System.out.println("You have inputted a Length of " +arrayLength+ " and a Height of " +arrayHeight);
		artArray = new char[arrayHeight][arrayLength];
		System.out.println("Creating the masterpiece(s) now");
		do
		{
			for(int i=0; i<arrayHeight; i++)
			{
				for(int j=0; j<arrayLength; j++)
				{
					randomValue = (rand.nextInt(2) + 1);
					if(randomValue == 1)
						artArray[i][j] = ' ';
					else if(randomValue == 2)
						artArray[i][j] = '█';
				}
			}
			for(int i=0; i<arrayHeight; i++)
			{
				for(int j=0; j<arrayLength; j++)
				{
					System.out.print(artArray[i][j]);
				}
				System.out.println();
			}
			masterpieceNumber++;
			System.out.println("Masterpiece number: " +masterpieceNumber);
			System.out.print("Do you want to make another? (Yes or No)");
			tempStringInput = keyboard.next();
			if(tempStringInput.equalsIgnoreCase("Yes") == true)
			{
				System.out.println("Making next masterpiece!");
				continue;
			}
			else if(tempStringInput.equalsIgnoreCase("No") == true)
			{
				System.out.println("Masterpieces all made! Have a nice day!");
				System.exit(0);
			}
			else
			{
				System.out.println("ERROR, UNKNOWN INPUT. ASSUMING ANSWER IS NO.");
				System.out.println("Masterpieces all made! Have a nice day!");
				System.exit(0);
			}
		}
		while(true);

	}

}
