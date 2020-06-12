package phones;

public class PushButtonPhone extends DeskPhone{

	public PushButtonPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}

	@Override
	public String call(long number) {
		return "Pushing buttons to call " + number;
	}

}
