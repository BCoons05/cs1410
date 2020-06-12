package nuisance;

/**
 * insect class contains a species and toString.
 * 
 * @author Brian
 *
 */
public class Insect {
	private String species;

	/**
	 * constructor for insect.
	 * 
	 * @param species String
	 */
	public Insect(String species) {
		super();
		this.species = species;
	}

	/**
	 * getter for species.
	 * 
	 * @return String species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * overrides toString to return classname : species.
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.getSpecies();
	}
	
	
}
