package nuisance;

/**
 * Class for telemarketer which is a person and a nuisance
 * 
 * @author Brian
 *
 */
public class Telemarketer extends Person implements Nuisance{

	/**
	 * constructor for telemarketer
	 * 
	 * @param name String
	 * @param age int
	 */
	public Telemarketer(String name, int age) {
		super(name, age);
	}
	
	/**
	 * returns a name with "pressures others to buy stuff
	 * 
	 * @return String
	 */
	public String giveSalesPitch() {
		return super.getName() + " pressures others to buy stuff";
	}

	/**
	 * overrides annoy, returns a String with the name plus annoys by giving a sales pitch
	 * 
	 * @return String
	 */
	@Override
	public String annoy() {
		return super.getName() + " annoys by giving a sales pitch";
	}

}
