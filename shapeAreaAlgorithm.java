/*
 * Christopher Schweninger
 */
import java.util.Scanner;
public class shapeAreaAlgorithm {

	//PI as a static variable
	public static double PI = 3.14;
	public static void main(String[] args) {
		//Setup
		int choice, input1, input2;
		double areaValue;
		Scanner keyboard = new Scanner(System.in);
		shapeAreaAlgorithm shape = new shapeAreaAlgorithm();
		//Welcoming
		System.out.println("This program will determine the area of 1 of 3 shapes.");
		System.out.println("Please indicate what shape's area you would like to compute.");
		System.out.println("1-Square  2-Circle  3-RightTriangle");
		choice = keyboard.nextInt();
		//Shape selector. I check to make sure only 1-3 are valid inputs.
		if(choice <= 0 || choice >= 4)
		{
			System.out.println("ERROR: UNKNOWN SHAPE HAS BEEN INDICATED. EXITING PROGRAM");
			System.exit(0);
		}
		//Rectangle area
		else if(choice == 1)
		{
			System.out.println("You have selected Rectangle.");
			System.out.print("Please input side 1: ");
			input1 = keyboard.nextInt();
			System.out.print("Please input side 2: ");
			input2 = keyboard.nextInt();
			areaValue = shape.RectArea(input1, input2);
			System.out.println("The area is: " + areaValue);
		}
		//Circle area
		else if(choice == 2)
		{
			System.out.println("You have selected Triangle.");
			System.out.print("Please input radius: ");
			input1 = keyboard.nextInt();
			areaValue = shape.CircleArea(input1);
			System.out.println("The area is: " + areaValue);
		}
		//Triangle area
		else if(choice == 3)
		{
			System.out.println("You have selected Triangle.");
			System.out.print("Please input side 1: ");
			input1 = keyboard.nextInt();
			System.out.print("Please input side 2: ");
			input2 = keyboard.nextInt();
			areaValue = shape.TriArea(input1, input2);
			System.out.println("The area is: " + areaValue);
		}
		//End of main
	}
	//Area(Rectangle) = length * width
	public double RectArea(int sideOne, int sideTwo)
	{
		return sideOne*sideTwo;
	}
	//Area(Circle) = PI(radius^2)
	public double CircleArea(int radius)
	{
		return PI*(radius*radius);
	}
	//Area(Right Triangle) = (length * width)/2
	public double TriArea(int sideOne, int sideTwo)
	{
		return (sideOne*sideTwo)/2;
	}

}
