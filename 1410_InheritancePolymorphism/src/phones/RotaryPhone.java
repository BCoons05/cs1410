package phones;

public class RotaryPhone extends DeskPhone{

	public RotaryPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}
	
	@Override
	public String call(long number) {
		return "Rotating the dial to call " + number;
	}
	

}
