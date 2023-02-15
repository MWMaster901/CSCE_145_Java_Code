/*
 * Created by: Christopher Schweninger
 */
public class Lizard {
	
	private String name;
	private double length;
	private String color;
	
	//Basic Constructor
	public Lizard()
	{
		name = "No Name Yet.";
		length = 0.0;
		color = "No Color Yet.";
	}
	//Parameterized Constructor
	public Lizard(String initialName, double initialLength, String initialColor)
	{
		name = initialName;
		color = initialColor;
		if (initialLength <= 0.0)
		{
			System.out.println("ERROR: INVALID LENGTH ENTERED. EXITING PROGRAM.");
			System.exit(0);
		}
		else
			length = initialLength;
	}
	//Setter for all
	public void setLizard(String newName, double newLength, String newColor)
	{
		name = newName;
		color = newColor;
		if (newLength <= 0.0)
		{
			System.out.println("ERROR: INVALID LENGTH ENTERED. EXITING PROGRAM.");
			System.exit(0);
		}
		else
			length = newLength;
	}
	//Setter for name
	public void setLizardName(String newName)
	{
		name = newName;
	}
	//Setter for length
	public void setLizardLength(double newLength)
	{
		if (newLength <= 0.0)
		{
			System.out.println("ERROR: INVALID LENGTH ENTERED. EXITING PROGRAM.");
			System.exit(0);
		}
		else
			length = newLength;
	}
	//Setter for Color
	public void setLizardColor(String newColor)
	{
		color = newColor;
	}
	//Getters
	public String getName()
	{
		return name;
	}
	public double getLength()
	{
		return length;
	}
	public String getColor()
	{
		return color;
	}
	//Data output writers
	public void writeOutput()
	{
		System.out.println("Name: " +name);
		System.out.println("Length (ft): " +length);
		System.out.println("Color: " +color);
	}
	public String toString()
	{
		return this.name + " " + this.length + " " + this.color;
	}

}