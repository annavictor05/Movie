import java. util. Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		

		Scanner sc =  new Scanner(System.in);
		
		String name;// = sc.nextLine();
		String rating;// = sc.nextInt();
		int numTickets ;
		char choice;
		Movie movie = new Movie();
		String buffer;
		
	do {	
		

		System.out.println("Enter the title of a movie: ");
		name = sc.nextLine();
		movie.setTitle(name);
		System.out.println("Enter the rating of the movie: ");
		rating = sc.nextLine();
		movie.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie" );
		numTickets = sc.nextInt();
		movie.setSoldTickets(numTickets);
		System.out.println(movie.toString());
		System.out.println("Do you want to enter another? (y or n)" );
		choice = sc.next().charAt(0);
		buffer = sc.nextLine();
	
	} while (choice == ('y') || (choice == ('Y')));
	System.out.println("Goodbye");
		
		
		
		
	}

}
