package docComments;

/**
 * Car make model and miles per gallon.
 * 
 * @author Brian
 *
 */
public class Car {
	private String make;
	private String model;
	private int mpg;
	
	/**
	 * Constructor initializes fields.
	 * @param make  car make
	 * @param model  car model
	 * @param mpg  miles per gallon
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}

	/**
	 * returns car make.
	 * 
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * returns car model.
	 * 
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * returns car miles per gallon.
	 * 
	 * @return the mpg
	 */
	public int getMpg() {
		return mpg;
	}

}
