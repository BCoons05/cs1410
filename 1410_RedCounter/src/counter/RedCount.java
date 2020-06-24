package counter;

/**
 * Keeps track of times button background is red.
 * 
 * @author Brian
 *
 */
public class RedCount {

	private int redCount;

	public RedCount() {
		super();
		this.redCount = 0;
	}

	public int getRedCount() {
		return redCount;
	}

	public void updateRedCount() {
		this.redCount++;
	}
	
	
}
