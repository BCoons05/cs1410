package docComments;

public class TravelApp {

	public static void main(String[] args) {
		Car m4 = new Car("BMW", "M4", 25);
		Car civic = new Car("Honda", "Civic", 42);
		
		System.out.println("Cars: \n" + m4.getMake() + " " + m4.getModel() + " " + m4.getMpg() + " mpg");
		System.out.println(civic.getMake() + " " + civic.getModel() + " " + civic.getMpg() + " mpg\n");
		
		TripPlanner californiaTrip = new TripPlanner("SF", "LA", 382, m4);
		TripPlanner floridaTrip = new TripPlanner("Tampa", "Miami", 280, civic);
		
		System.out.println("California Trip: \n" + californiaTrip.toString() + "\nfuel consumption: " 
								+ Math.round(californiaTrip.fuelConsumption() * 10) / 10.0 + " gallons\n");
		System.out.println("Florida Trip: \n" + floridaTrip.toString() + "\nfuel consumption: " 
								+ Math.round(floridaTrip.fuelConsumption() * 10) / 10.0 + " gallons");

	}

}
