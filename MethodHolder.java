public class MethodHolder {

	private int numbInput1, numbInput2;
	private String strInput;
	
	public static void IfMethod(String strInput)
	{
		System.out.println("This method will give 1 of 3 outputs based on the length of the provided string.");
		if(strInput.length() < 3)
			System.out.println("You have inputted a small string.");
		else if(strInput.length() > 2 && strInput.length() < 10)
			System.out.println("You have inputted a moderate length string.");
		else
			System.out.println("You have inputted a long string");
		
		System.out.println("IfMethod Complete");
	}
	
	public static void ForMethod(int numbInput1)
	{
		System.out.println("This method will repeat the text {This text can be annoying} a number of times equal to the first number value");
		for(int i = 0; i < numbInput1; i++)
			System.out.println("This text can be annoying");
		
		System.out.println("ForMethod Complete");
	}
	
	public static void WhileMethod(int numbInput2)
	{
		System.out.println("This method will repeat until the inputted number is greater than 1000 or -1000 by doubling the inputted number");
		while(numbInput2 < 1000 || numbInput2 < -1000)
		{
			numbInput2 *= 2;
			System.out.println("Current number: " +numbInput2);
		}
		System.out.println("WhileMethod Complete");
	}
	
	public static void ArrayMethod(int numbInput1, int numbInput2)
	{
		System.out.println("This method will create and array of size numbInput1 and will fill it with numbers according to it position + 2. Then it will subtract each number to the second inputted number and print each result.");
		int[] testArray = new int[numbInput1];
		int temp;
		for(int i = 0; i < testArray.length; i++)
			testArray[i] = i + 2;
		
		for(int i = 0; i < testArray.length; i++)
		{
			temp = testArray[i] - numbInput2;
			System.out.println(temp);
		}
	}
	public static void TestMethod(int numbInput1, int numbInput2, String strInput)
	{
		System.out.println("Starting IfMethod");
		IfMethod(strInput);
		System.out.println("Starting ForMethod");
		ForMethod(numbInput1);
		System.out.println("Starting WhileMethod");
		WhileMethod(numbInput2);
		System.out.println("Starting ArrayMethod");
		ArrayMethod(numbInput1, numbInput2);
		System.out.println("All methods have been run");
	}
}
