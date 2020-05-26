package docComments;

/**
 * Trip information with departure, arrival, and distance.
 * 
 * @author Brian
 *
 */
public class TripPlanner {
	private String departure;
	private String arrival;
	private int distance;
	private Car car;
	/**
	 * @param departure departure location as string
	 * @param arrival arrival location as string
	 * @param distance distance in miles between departure and arrival
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	
	/**
	 * Returns gallons of gas needed
	 * by dividing trip distance by car mpg.
	 * 
	 * @return double
	 */
	public double fuelConsumption() {
		return ((double) distance) / car.getMpg();
	}

	/**
	 * Returns a string containing departure, arrival, 
	 * distance, and car model with headers for each. 
	 * 
	 * @return String 
	 */
	@Override
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car=" + car.getModel() + "]";
	}
	

}
