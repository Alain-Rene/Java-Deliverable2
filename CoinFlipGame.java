package src;

import java.util.Scanner;
import java.util.Random;

public class CoinFlipGame {

	public static void main(String[] args) {
		
		//Variable declaration
		String name;
		String userResponse;
		int score = 0;
		int coin;
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//Intro message that asks user to input name
		System.out.println("Hello! What is your name?");
		
		name = sc.nextLine();
		
		System.out.println("Hello " + name + 
				". Do you want to play the coin flip challenge? Please enter Yes or No");
		
		//stores the users input as all lowercase so that the response is not case sensitive
		userResponse = sc.nextLine().toLowerCase();
		
		//If yes, this conditional is ignored, and the program continues
		if (userResponse.equals("yes")) {
			
		} else if (userResponse.equals("no")) {
			//If no, exit the program after calling the user a coward
			System.out.println("You are a coward, " + name);
			System.exit(0);
		} else {
			// If the user inputs anything other than yes or no
			System.out.println("Invalid response");
			System.exit(0);
		}
		
		//For loop, where x is the number of "rounds" of the game
		for (int x = 1; x <= 5; x++) {
			System.out.println("Heads or Tails?");
			userResponse = sc.nextLine().toLowerCase();
			
			//Coin variable uses random to become either 0(heads) or 1(tails)
			coin = random.nextInt(2);
			
			//Checks if coin value and user's input matches
			if (coin == 0 && userResponse.equals("heads")) {
				System.out.println("Correct!");
				score += 1;
			} else if(coin == 1 && userResponse.equals("tails")) {
				System.out.println("Correct!");
				score += 1;
			} else {
				System.out.println("Wrong!");
			}
		}
		//Ending message, and prints score for the game
		System.out.println("Thank you for playing, " + name + "! Your score is: "
				+ score + "!");
		
	}

}
