package m02;

/**
 * Creates PowerPlant. Generates electricity and overrides toString.
 * 
 * @author Brian
 *
 */
public class PowerPlant {
	private int capacity;

	/**
	 * constructor for PowerPLant. Checks if capacity is positive value first.
	 * 
	 * @param capacity
	 * @throws IllegalArgumentException if capacity not > 0
	 */
	public PowerPlant(int capacity) {
		super();
		
		if(capacity > 0) {
			this.capacity = capacity;
		} else {
			throw new IllegalArgumentException("Capacity must be a positive whole number");
		}
	}
	
	/**
	 * Returns String generating electricity.
	 * 
	 * @return
	 */
	public String generateElectricity() {
		return "generating electricity";
	}

	/**
	 * override toString to return name of class plus capacity followed by MW.
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + this.capacity + "MW";
	}
	
	
}
