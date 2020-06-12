package phones;

public abstract class DeskPhone extends Phone{
	private Voltage voltage;
	public boolean connected;
	
	protected DeskPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension);
		this.voltage = voltage;
	}
	
	public void plugIn() {
		connected = true;
	}
	
	public void unplug() {
		connected = false;
	}
	
	public boolean isConnected() {
		return connected;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.voltage + " " + (this.connected ? "connected" : "not connected");
	}
	
	
	
}
