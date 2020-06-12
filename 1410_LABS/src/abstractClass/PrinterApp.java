package abstractClass;

/**
 * App to display printers of two types, have them print,
 * refill toner or cartridge, and display remaining toner/cartridge.
 * 
 * @author Brian
 *
 */
public class PrinterApp {

	public static void main(String[] args) {
		Printer inkjet = new InkjetPrinter("Canon TS202");
		Printer laser = new LaserPrinter("Samsung Xpress");
		
		Printer[] printers = {inkjet, laser};
		
		for(Printer printer : printers) {
			System.out.println(printer.toString());
			for(int i = 0; i < 11; i++) {
				printer.print();
			}
			
			System.out.println();
			
			if(printer instanceof InkjetPrinter) {
				((InkjetPrinter) printer).refillCartridge();
			} else {
				((LaserPrinter)printer).refillToner();
			}
			
		}
		
		System.out.println("Remaining cartridge after refilling: " + ((InkjetPrinter) inkjet).getRemainingCartridge() + "%");
		System.out.println("Remaining cartridge after refilling: " + ((LaserPrinter) laser).getRemainingToner() + "%");

	}

}
