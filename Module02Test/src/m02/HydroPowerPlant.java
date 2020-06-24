package m02;

/**
 * Creates HydroPowerPlant which is a PowerPLant. Contains getter for dam,
 * generates electricity, and overrides toString.
 * 
 * @author Brian
 *
 */
public class HydroPowerPlant extends PowerPlant{
	
	private boolean dam;
	
	/**
	 * Constructor for HydroPowerPlant. Inherits capacity from PowerPlant.
	 * 
	 * @param capacity
	 * @param dam
	 */
	public HydroPowerPlant(int capacity, boolean dam) {
		super(capacity);
		this.dam = dam;
	}
	
	/**
	 * getter for dam.
	 * 
	 * @return boolean true if it has a dam
	 */
	public boolean hasDam() {
		return dam;
	}
	
	/**
	 * returns generating electricity from water.
	 */
	@Override
	public String generateElectricity() {
		return "generating electricity from water";
	}

	/**
	 * returns toString from PowerPLant plus with a dam if hasDam is true.
	 */
	@Override
	public String toString() {
		return super.toString() + (this.hasDam() ? " with a dam" : " without a dam");
	}
	
	

}
