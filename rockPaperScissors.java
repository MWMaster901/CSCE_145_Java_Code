/*
 * Created by Christopher Schweninger
 */
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("As always Rock beats Scissors, Scissors beats Paper, and Paper beats Rock.");
		System.out.println("When prompted, input your desired choice. The computer will then randomly decide as well.");
		System.out.println("The winner gets a point, the loser gets no point, and neither gets a point if there is a draw.");
		System.out.println("After 3 rounds, an overall winner will be determined! In the case of an overall tie, the user always wins.");
		System.out.println("[Make sure to type the full input, incomplete or unknown inputs will result in a loss! (Caps doesn't matter though)]");
		System.out.println("Are you ready to begin? (Yes to start or No to end program.)");
		//A long intro.
		String input;
		int playerPoints, computerPoints, computerMove, min, max;
		min = 1;
		max = 3;
		//Setting up variables
		input = keyboard.next();
		if(input.equals("Yes") == true)
		{
			while(true)
			{
				//This sets up the game
				playerPoints = 0;
				computerPoints = 0;
				for(int i=1;i<4;i++)
				{
				System.out.println("Alright then, let Round " +i+ " begin!.");
				System.out.println("Choose either Rock, Paper, or Scissors!");
				input = keyboard.next();
				computerMove = (rand.nextInt(3) + 1);
				/*1=Rock 2=Paper 3=Scissors
				 *This chooses what the computer decides
				 *Debug commands: instantRoundWin, instantRoundLoss, instantRoundTie
				 *You must input the Debug commands exactly as they appear
				 */
				if(((input.equalsIgnoreCase("Rock") == true) && (computerMove == 1)) || ((input.equalsIgnoreCase("Paper") == true) && (computerMove == 2)) || ((input.equalsIgnoreCase("Scissors") == true) && (computerMove == 3)) || (input.equals("instantRoundTie") == true))
				{
					//Tie Scenario
					System.out.println("There is a tie, no points awarded.");
				}
				else if(((input.equalsIgnoreCase("Rock") == true) && (computerMove == 3)) || ((input.equalsIgnoreCase("Paper") == true) && (computerMove == 1)) || ((input.equalsIgnoreCase("Scissors") == true) && (computerMove == 2)) || (input.equals("instantRoundWin") == true))
				{
					//Win Scenario
					System.out.println("You win! +1 Player Point");
					playerPoints++;
				}
				else if(((input.equalsIgnoreCase("Rock") == true) && (computerMove == 2)) || ((input.equalsIgnoreCase("Paper") == true) && (computerMove == 3)) || ((input.equalsIgnoreCase("Scissors") == true) && (computerMove == 1)) || (input.equals("instantRoundLoss") == true))
				{
					//Lose Scenario
					System.out.println("You lose. +1 Computer Point");
					computerPoints++;
				}
				else
				{
					//Error Scenario
					System.out.println("Error: Input invalid, computer automatically wins this round. +1 Computer Point.");
					computerPoints++;
				}
				if(i == 3)
				{
					//All three round complete
					System.out.println("Game complete, tallying results");
					System.out.println("Player: " +playerPoints+ " || Computer: " +computerPoints);
					if(playerPoints > computerPoints)
					{
						System.out.println("Player wins");
					}
					else if(computerPoints > playerPoints)
					{
						System.out.println("Computer wins");
					}
					else if(computerPoints == playerPoints)
					{
						System.out.println("Player wins by default (Tie)");
					}
				}
				}
				System.out.println("Do you want to play again? Yes or No");
				input = keyboard.next();
				if(input.equalsIgnoreCase("Yes") == true)
				{
					//Play again
					continue;
				}
				else if(input.equalsIgnoreCase("No") == true)
				{
					//All done
					System.out.println("Have a nice day!");
					System.exit(0);
				}
				else
				{
					//Error answer
					System.out.println("Error: Input invalid assuming No option.");
					System.out.println("Have a nice day!");
					System.exit(0);
				}
			}
		}
		else if(input.equals("No") == true)
		{
			//Sadness
			System.out.println("Aww, alright then. Have a nice day!");
			System.exit(0);
		}
		else
		{
			//Initial error answer
			System.out.println("Error, inputted value does not compute. Assuming input is 'No'.");
			System.out.println("Aww, alright then. Have a nice day!");
			System.exit(0);
		}

	}

}
