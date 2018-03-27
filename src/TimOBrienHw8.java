
public class TimOBrienHw8 {

	public static void main(String[] args) {
		
		System.out.println("Tim O'Brien, Java Online");
		
		Movie[] category = new Movie[6]; 
		
		//Animated
		category[0] =  new Animated(20, 10.45);
		category[1] =  new Animated(20, 10.45);
		
		//Doc.
		category[2] =  new Documentary(20, 10.45);
   	 	category[3] =  new Documentary(20, 10.45);

   	 	//Drama
   	 	category[4] =  new Drama(20, 10.45);
   	 	category[5] =  new Drama(20, 10.45);
   	 	
   	 	printMovieInfo(category);
   	 	
	}
	
	public static void printMovieInfo(Movie[] category) {
		for(int i = 0; i<category.length; i++) {
			System.out.printf("%1s", category[i]);
		}
	}

}
