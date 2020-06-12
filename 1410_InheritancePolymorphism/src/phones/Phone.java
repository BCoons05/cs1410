package phones;

public abstract class Phone {
	private String model;
	private Dimension dimension;
	
	public abstract String call(long number);

	protected Phone(String model, Dimension dimension) {
		super();
		this.model = model;
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return model + " " + dimension;
	}
	
	
}
