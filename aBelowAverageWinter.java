/*
 * Created by Christopher Schweninger
 */
import java.util.Scanner;
public class aBelowAverageWinter {

	public static void main(String[] args) {
		//Declaration of variables and arrays
		double[] temperature = new double[11];
		double sum = 0;
		double avg = 0;
		//Introduction
		System.out.println("This program will take 10 inputted temperatures (00.0 format), take the average,");
		System.out.println("then display which temperatures are below average.");
		Scanner keyboard = new Scanner(System.in);
		//Input loop
		System.out.println("Please begin inputting the temperatures:");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Input the temperature for day " +i);
			temperature[i] = keyboard.nextDouble();
			sum = sum + temperature[i];
		}
		//Average calculation
		avg = sum / 10;
		System.out.println("The average temperature is: " +avg);
		//Now I display the temperatures that are below average
		System.out.println("These days and temps were below average");
		for(int i = 1; i <= 10; i++)
		{
			if(temperature[i] < avg)
			{
				System.out.println("Day " +i+ " with a temp of " +temperature[i]);
			}
		}
		System.out.println("Have a nice day!");
	}

}
