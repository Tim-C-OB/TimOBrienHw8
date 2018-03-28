
public class TimOBrienHw8 {

	public static void main(String[] args) {
		
		System.out.println("Tim O'Brien, Java Online\n");
		
		Movie[] category = new Movie[6]; 
		
		//Animated
		category[0] =  new Animated(20, 10.45, "8 Crazy Nights", "Adam Sandler", 2002, 209.5); 
		category[1] =  new Animated(20, 10.45, "Finding Nemo", "Graham Walters", 2003, 39.6);
		
		//Doc.
		category[2] =  new Documentary(16, 10.33, "Super Size Me", "Morgan Spurlock", 2004, 84.45);
   	 	category[3] =  new Documentary(9, 16.75, "Man On Wire", "James Marsh", 2008, 339.44);

   	 	//Drama
   	 	category[4] =  new Drama(15, 10.55, "The Notebook", "Nick Cassavetes", 2004, 194.56);
   	 	category[5] =  new Drama(101, 12.55, "Titanic", "James Cameron", 1997, 892.38);
   	 	
   	 	printMovieInfo(category);
   	 	
   	 	double total = calcTotalProfits(category);
   	 	
   	 	System.out.printf("Total profits, %.2f", total);
   	 	
	}
	
	public static void printMovieInfo(Movie[] category) {
		for(Movie d : category) {
			System.out.printf("%s \n\n", d.toString());
		}
	}
	
	public static double calcTotalProfits(Movie[] profits) {
		double total = 0;
		
		for(int i = 0; i < profits.length; i++) {
			total += profits[i].calcProfit();
		}
		return total;
	}

}//End of Class
