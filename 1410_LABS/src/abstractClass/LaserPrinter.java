package abstractClass;

/**
 * Creates a LaserPrinter which is a type of printer.
 * 
 * @author Brian
 *
 */
public class LaserPrinter extends Printer{
	
	private int remainingToner;

	public LaserPrinter(String model) {
		super(model);
		remainingToner = 100;
		
	}

	/**
	 * getter for remaining toner.
	 * 
	 * @return int remainingToner
	 */
	public int getRemainingToner() {
		return remainingToner;
	}
	
	/**
	 * Resets toner value to 100.
	 */
	public void refillToner() {
		remainingToner = 100;
	}

	/**
	 * Displays {model} is printing. Remaining toner: {remainingtoner}%
	 * unless toner is empty, then will display The toner is empty.
	 */
	@Override
	public void print() {
		if(remainingToner <= 0) {
			System.out.println("The toner is empty.");
		} else {
			remainingToner -= 10;
			System.out.println(this.getModel() + " is printing. Remaining toner: " + remainingToner + "%");
		}
		
	}
}
