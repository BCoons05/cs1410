package abstractClass;

/**
 * Abstract class for printers. Sets model from params,
 * increments count and adds that to the serial number.
 * 
 * @author Brian
 *
 */
public abstract class Printer {
	private String model;
	static int count;
	private int serialNumber;
	
	public Printer(String model) {
		super();
		this.model = model;
		count++;
		serialNumber = count + 12345;
	}

	/**
	 * Gets model.
	 * 
	 * @return String model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Gets serialNumber.
	 * 
	 * @return int serialNumber
	 */
	public int getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Displays {model} is printing. Remaining toner: {remainingToner}%
	 * unless toner is empty, then will display The toner is empty.
	 */
	public abstract void print();

	/**
	 * @return String {Class}: {model} #{serialNumber}.
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + model + " #" + serialNumber;
	}
	
	
}
