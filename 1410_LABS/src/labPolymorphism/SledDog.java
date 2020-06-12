package labPolymorphism;

/**
 * Extends Dog class and changes move method.
 * 
 * @author CSISProfessor
 *
 */
public class SledDog extends Dog
{
	/**
	 * Constructor for a SledDog object.
	 * 
	 * @param b
	 */
    public SledDog(String b)
    {
        super(b);
    }

    /**
     * Prints pulling the sled.
     */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
