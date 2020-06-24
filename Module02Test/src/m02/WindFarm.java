package m02;

/**
 * Class to create new WindFarm PowerPlant.
 * 
 * @author Brian
 *
 */
public class WindFarm extends PowerPlant{
	private boolean offshore;
	
	/**
	 * constructor
	 * 
	 * @param capacity int
	 */
	public WindFarm(int capacity) {
		super(capacity);
	}
	
	/**
	 * getter for offshore. states whether plant is offshore or not.
	 * 
	 * @return boolean
	 */
	public boolean offshore () {
		this.offshore = true;
		return offshore;
	}
	
	/**
	 * overrides from PowerPlant, to return string plus from the wind.
	 */
	@Override
	public String generateElectricity() {
		return "generating electricity from the wind";
	}

	/**
	 * override toString to return string with classname + ~~~ if offshore.
	 */
	@Override
	public String toString() {
		return super.toString() + (this.offshore ? " ~~~" : "");
	}
	
	
}
