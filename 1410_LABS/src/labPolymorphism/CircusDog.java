package labPolymorphism;

/**
 * Extends Dog class and changes move method.
 * 
 * @author CSISProfessor
 *
 */
public class CircusDog extends Dog
{
	/**
	 * Constructor for a CircusDog object.
	 * 
	 * @param b
	 */
    public CircusDog(String b)
    {
        super(b);
    }

    /**
     * Overrides move method from Dog to show tightrope walking.
     */
    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
