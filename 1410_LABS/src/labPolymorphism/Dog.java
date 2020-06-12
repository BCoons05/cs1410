package labPolymorphism;

/**
 * Creates new dog object that can communicate, move, and get breed
 * as well as an overridden toString.
 * 
 * @author CSISBrian
 *
 */
public class Dog
{
    private final String breed;

    /**
     * initializes breed.
     * 
     * @param b
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Prints bark bark.
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Prints run.
     */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * Getter for breed.
     * @return breed
     */
    public String getBreed()
    {
        return breed;
    }
    
    /**
     * Overrides toString to show a formatted string as follows:
     * {Class}: {breed}
     */
    @Override
    public String toString() {
    	return this.getClass().getSimpleName() + ": " + breed;
    }
}
