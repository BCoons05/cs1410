package nuisance;

/**
 * Class for a person. 
 * 
 * @author Brian
 *
 */
public class Person {
	private String name;
	private int age;
	
	/**
	 * takes a name and age if age is between 1 and 150 inclusive,
	 * will create a new Person.
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		if(age > 0 && age <= 150) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("Age must be greater than 0 and less than 151.");
		}
	}
	
	/**
	 * getter for name.
	 * 
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * getter for age.
	 * 
	 * @return int age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * part of equals override. checks to see if one friend matches another.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * overrides equals. Checks if one person is the same as another
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * overrides toString. Returns {name}({age})
	 */
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
}
