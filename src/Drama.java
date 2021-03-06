/** Program header:  Drama.java
 *
 * Author:    Tim O'Brien
 * Class:     Java Online
 *
 * Brief Program Description:
 *   Drama class, child of Movie.
 */

public class Drama extends Movie {

	/** a list of private data members goes here */
	private double ticketsSold, avgTicketPrice;
	
	/** constructors go here, with the default constructor leading other constructor(s) */
	public Drama() {}
	public Drama(double ticketsSold, double avgTicketPrice, String title, String director, int year, double productionCost) {
		super(title, director, year, productionCost);
		this.avgTicketPrice = avgTicketPrice;
		this.ticketsSold = ticketsSold;
	}
	
	/** getters for private data members go here. Other name: readers/accessors */
	public double getTicketsSold() {
		return ticketsSold;
	}
	
	public double getAvgTicketPrice() {
		return avgTicketPrice;
	}
	
	/** setters for private data members go here. Other name: writers/mutators */
	public void setTicketsSold(double ticketsSold) {
		this.ticketsSold = ticketsSold;
	}
	
	public void setAvgTicketPrice(double avgTicketPrice) {
		this.avgTicketPrice = avgTicketPrice;
	}
	
	/** effectors (methods that are not constructor/getter/setter) go here */
	public String getCategory() {
		String drama = "Drama";
		
		return drama;
	}
	
	public double calcRevenue() {
		double revenue = ticketsSold * avgTicketPrice;
		
		return revenue;
	}
	
	public double calcProfit() {
		double profit = calcRevenue() - getProductionCost();
		
		return profit;
	}
	
	public String toString() {
		String fromParent = super.toString(); 
		String myOwnMessage;
		if(calcProfit() > 0) {
			myOwnMessage = String.format ("This is a %1s movie, it generated %.3f in profit.", getCategory(), calcProfit());
		}else {
			myOwnMessage = String.format ("This is a %1s movie, it lost $%.3f.", getCategory(), calcProfit());
		}
		return fromParent + myOwnMessage; 
	}
	
}
