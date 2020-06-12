package nuisance;

import java.util.List;

/**
 * butterfly class is an insect. contains two contructors.
 * 
 * @author Brian
 *
 */
public class Butterfly extends Insect{
	
	private List<String> colors;

	/**
	 * Constructor for new butterfly.
	 * 
	 * @param species String
	 * @param colors List<String>
	 */
	public Butterfly(String species, List<String> colors) {
		super(species);
		this.colors = colors;
	}
	
	/**
	 * Constructor for butterfly if passed a butterfly object.
	 * 
	 * @param butterfly
	 */
	public Butterfly(Butterfly butterfly) {
		super(butterfly.getSpecies());
		this.colors = butterfly.getColors();
	}

	/**
	 * getter for list of colors.
	 * 
	 * @return list of colors
	 */
	public List<String> getColors() {
		return colors;
	}

	/**
	 * override for toString. Returns {species} [{colors}].
	 */
	@Override
	public String toString() {	
		return this.getSpecies() + " " + this.getColors();
	}

}
