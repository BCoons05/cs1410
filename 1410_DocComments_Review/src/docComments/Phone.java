package docComments;

/**
 * Creates a phone object using
 * Manufacturer, model, and storage size in GB
 * and populates a unique id for each new phone
 * 
 * @author Brian
 *
 */
public class Phone {
	private String manufacturer;
	private String model;
	private int storage;
	private static int count = 0;
	private int id;
	
	/**
	 * Constructs a new phone object
	 * 
	 * @param manufacturer
	 * @param model
	 * @param storage
	 * @param count
	 * @param id
	 */
	public Phone(String manufacturer, String model, int storage) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.storage = storage;
		this.id = 1111110 + count++;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the storage
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return manufacturer + " " + model + " " + storage + "gb id:" + id;
	}
	
	

}
