
import java.util.*;
public class RPS {


	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int userinput;
		int results;
		
		System.out.println("Rock, Paper, Scissors!\n" + 
                "Enter your choice.\n" + "Rock = 1, Paper" + 
                "= 2, and Scissors = 3.");
		userinput = input.nextInt();
		Random end = new Random(userinput);
		System.out.println("Press 1 or 2 for your lucky number!");
		results = input.nextInt();
		
		if (results == 1)
		{
			end.EnterValue(userinput);
		}
		else if (results == 2)
		{
			end.PolymorphismEndGame();
		}
		end.OutCome();
	}
}
