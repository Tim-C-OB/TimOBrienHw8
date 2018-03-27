/** Program header:  Movie.java
 *
 * Author:    Tim O'Brien
 * Class:     Java Online
 *
 * Brief Program Description:
 * Superclass of Documentary, Drama, and Animated. 
 */

public class Movie {
	
	/** a list of private data members goes here */
	private String title, director;
	private int year;
	private double productionCost;

	/** constructors go here, with the default constructor leading other constructor(s) */
	public Movie() {}
	public Movie(String title, String director, int year, double productionCost) {}
	
	/** getters for private data members go here. Other name: readers/accessors */
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getProductionCost() {
		return productionCost;
	}
	
	/** setters for private data members go here. Other name: writers/mutators */
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setProductionCost(double productionCost) {
		this.productionCost = productionCost;
	}
	
	/** effectors (methods that are not constructor/getter/setter) go here */
	public String toString() {
		String info = String.format("%8s, was directed by %8s in %8s for a total cost of %8s. \n", title, director, year, productionCost);
		return info;
	}
	
}
