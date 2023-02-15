import java.util.Scanner;

public class testProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbInput2 = 0;
		Scanner k = new Scanner(System.in);
		System.out.println("Input number");
		numbInput2 = k.nextInt();
		System.out.println("This method will repeat until the inputted number is greater than 1000 or -1000 by doubling the inputted number");
		while(numbInput2 < 1000 || numbInput2 < -1000)
		{
			
			numbInput2 *= 2;
			System.out.println("Current number: " +numbInput2);
		}
	}

}
