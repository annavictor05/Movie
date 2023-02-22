import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuesser {

	@SuppressWarnings("static-access")
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int Userguess; 
		int numGuesses;
		int highguess=100;
		int lowguess = 0;
		String again = "yes";
		int randomNum;

		while (again.equalsIgnoreCase("yes")) 
		{
			lowguess = 0;
			highguess = 100;
			RNG rng = new RNG ();
			randomNum= rng.rand();
			rng.resetCount();
			numGuesses = rng.getCount();
			System.out.println("Enter your first guess: ");
			Userguess = sc.nextInt();
			//rng.inputValidation(Userguess, lowguess, highguess);

	
			while(Userguess <0 || Userguess >100) {
				rng.inputValidation(Userguess, lowguess, highguess);
				Userguess = sc.nextInt();
			}
			

			while (Userguess != randomNum && rng.getCount() < 7) {
				if(numGuesses >= 7) {
					System.out.println("You have exceeded the number of guesses, 7.");
					break;
				}
				if (Userguess > randomNum)
				{
					System.out.println("Your guess is too high ");
					highguess = Userguess;
				}
				else if(Userguess < randomNum) {
					System.out.println("Your guess is too low");
					lowguess = Userguess;	
				}
				
				System.out.println("Number of guesses is "+ rng.getCount());
				System.out.println("Enter your next guess between "+lowguess+ " and " + highguess + ": ");
				Userguess = sc.nextInt();
				rng.inputValidation(Userguess, lowguess, highguess);
				
				while(Userguess <lowguess || Userguess >highguess) {
					
					Userguess = sc.nextInt();
				}

			}
			if(Userguess == randomNum) {
				System.out.println("Congratulations! You have guessed the number correctly!");
			}
			sc.nextLine();
			System.out.println("Try again? (yes/no)");
			again = sc.nextLine();
			if (again.equalsIgnoreCase ("no")) {
				System.out.println("Thanks for playing");
			}
		}
	}
}

