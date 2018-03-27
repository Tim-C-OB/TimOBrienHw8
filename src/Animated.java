/** Program header:  Animated.java
 *
 * Author:    Tim O'Brien
 * Class:     Java Online
 *
 * Brief Program Description:
 *   Class Animated, child class of Movie.
 */

public class Animated extends Movie {

	/** a list of private data members goes here */
	private double royaltyRates, incomeOfProducts;

	/** constructors go here, with the default constructor leading other constructor(s) */
	public Animated() {}
	public Animated(double royaltyRates, double incomeOfProducts, String title, String director, 
					int year, double productionCost) {
		super(title, director, year, productionCost);
		this.royaltyRates = royaltyRates;
		this.incomeOfProducts = incomeOfProducts;
	}
	
	/** getters for private data members go here. Other name: readers/accessors */
	public double getRoyaltyRates() {
		return royaltyRates;
	}
	
	public double getIncomeOfProducts() {
		return incomeOfProducts;
	}
	
	/** setters for private data members go here. Other name: writers/mutators */
	public void setRoyaltyRates(double royaltyRates) {
		this.royaltyRates = royaltyRates;
	}
	
	public void setIncomeOfProducts(double incomeOfProducts) {
		this.incomeOfProducts = incomeOfProducts;
	}
	
	/** effectors (methods that are not constructor/getter/setter) go here */
	public String getCategory() {
		String a = "animated";
		return a;
	}
	
	public double calcRevenue() {
		double revenue = incomeOfProducts * royaltyRates;
		
		return revenue;
	}
	
	public double calcProfit() {
		double profit = calcRevenue() - getProductionCost();
		
		return profit;
	}
	
	public String toString() {
		String fromParent = super.toString(); 
		String myOwnMessage = String.format ("This is an %8s movie, it generated %8s in profit.", getCategory(), calcProfit()); 
		return fromParent + myOwnMessage; 
	}
	
}//End of class
