package phones;

public class SmartPhone extends Phone{
	private int storage;

	public SmartPhone(String string, Dimension dimension, int storage) {
		super(string, dimension);
		
		if(storage > 0) {
			this.storage = storage;
		} else {
			throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
		}
	}

	@Override
	public String call(long number) {
		return "Calling " + number + " by selecting the number";
	}
	
	public String browse() {
		return "Browsing the web";
	}
	
	public String takePicture() {
		String[] pictureOptions = {"Taking a horizontal picture" , "Taking a vertical picture"};
		return pictureOptions[(int)(Math.random()*pictureOptions.length)];
	}

	@Override
	public String toString() {
		return super.toString() + " " + storage + "GB";
	}
	
}
