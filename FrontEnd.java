import java.util.Scanner;

public class FrontEnd {
	
	public static void main(String[] args) {
		int input1, input2;
		String inputString;
		Scanner k = new Scanner(System.in);
		System.out.println("Before we begin testing, some values are needed.");
		System.out.println("Please input a integer, preferably around 5-10");
		input1 = k.nextInt();
		System.out.println("Please input another integer, preferably around 5-20");
		input2 = k.nextInt();
		System.out.println("Please input a String");
		inputString = k.next();
		MethodHolder.TestMethod(input1,  input2,  inputString);
	}
}