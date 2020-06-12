package nuisance;

/**
 * Class for mosquito which is an insect and a nuisance.
 * 
 * @author Brian
 *
 */
public class Mosquito extends Insect implements Nuisance{

	/**
	 * Constructor for mosquito.
	 * 
	 * @param species String
	 */
	public Mosquito(String species) {
		super(species);
	}
	
	/**
	 * returns a string with the speices and buzzing around.
	 * 
	 * @return String species + buzzing around
	 */
	public String buzz() {
		return this.getSpecies() + " buzzing around";
	}

	/**
	 * overrides annoy, returns buzz buzz buzz.
	 */
	@Override
	public String annoy() {
		return "buzz buzz buzz";
	}

}
