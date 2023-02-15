/*
 * Created by: Christopher Schweninger
 */
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		//Variable calling
		String answer, nameInput, colorInput;
		double lengthInput;
		Scanner keyboard = new Scanner(System.in);
		//Introduction
		System.out.println("Welcome to the lizard store!");
		System.out.println("Would you like to buy a lizard?");
		answer = keyboard.next();
		//Yes/No Check
		if(answer.equalsIgnoreCase("No") == true)
		{
			System.out.println("Alright then. Have a nice day!");
			System.exit(0);
		}
		else if(answer.equalsIgnoreCase("Yes") != true)
		{
			System.out.println("ERROR: INPUT IS NOT YES/NO. EXITING PROGRAM");
			System.exit(0);
		}
		System.out.println("Lovely, please enter the neccesary data when prompted!");
		//Makes a newLizard Object
		Lizard newLizard = new Lizard();
		//Collecting data
		System.out.println("Please enter the lizard's name.");
		nameInput = keyboard.next();
		System.out.println("Please enter the lizard's length (feet).");
		lengthInput = keyboard.nextDouble();
		System.out.println("Please enter the lizard's color.");
		colorInput = keyboard.next();
		System.out.println("All neccesary data has been entered, creating lizard!");
		//Assigning data to lizard
		newLizard.setLizard(nameInput,  lengthInput,  colorInput);
		System.out.println("Lizard created! Relaying inputs...");
		//Replaying assigned data of lizard
		newLizard.writeOutput();
		System.out.println("Have a nice day!");

	}

}
