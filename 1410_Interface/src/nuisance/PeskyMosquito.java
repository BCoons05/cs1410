package nuisance;

/**
 * peskymosquito is a mosquito and can bite.
 * 
 * @author Brian
 *
 */
public class PeskyMosquito extends Mosquito{

	/**
	 * constructor for a peskymosquito.
	 * 
	 * @param species
	 */
	public PeskyMosquito(String species) {
		super(species);
	}
	
	/**
	 * bites person. returns a string.
	 * 
	 * @return String sucing blood
	 */
	public String bite() {
		return "sucking blood";
	}

}
