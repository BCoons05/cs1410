package phones;

public class Dimension {
	
	private double height;
	private double width;
	private double depth;
	
	public Dimension(double height, double width, double depth) {
		super();
		
		if(height > 0 && width > 0 && depth > 0) {
			this.height = height;
			this.width = width;
			this.depth = depth;
		} else {
			throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
		}
	}
	
	
	
	public double getHeight() {
		return this.height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getDepth() {
		return this.depth;
	}

	@Override
	public String toString() {
		return "(" + Math.round(this.height * 10) / 10.0 + " x " + Math.round(this.width * 10) / 10.0 + " x " + Math.round(this.depth * 10) / 10.0 + ")";
	}
	
	
}
