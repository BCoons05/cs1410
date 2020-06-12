package abstractClass;

/**
 * Creates an inkjet printer which is a printer. 
 * 
 * @author Brian
 *
 */
public class InkjetPrinter extends Printer{
	
	private int remainingCartridge;

	public InkjetPrinter(String model) {
		super(model);
		remainingCartridge = 100;
	}

	/**
	 * Gets remaining cartridge.
	 * 
	 * @return int remainingCartridge
	 */
	public int getRemainingCartridge() {
		return remainingCartridge;
	}
	
	/**
	 * resets remaining cartridge back to 100.
	 */
	public void refillCartridge() {
		remainingCartridge = 100;
	}

	/**
	 * Displays {model} is printing. Remaining cartridge: {remainingCartridge}%
	 * unless cartridge is empty, then will display The cartridge is empty.
	 */
	@Override
	public void print() {
		if(remainingCartridge <= 0) {
			System.out.println("The cartridge is empty.");
		} else {
			remainingCartridge -= 10;
			System.out.println(this.getModel() + " is printing. Remaining cartridge: " + remainingCartridge + "%");
		}
		
	}

}
