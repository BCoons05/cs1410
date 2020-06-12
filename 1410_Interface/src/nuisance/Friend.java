package nuisance;

/**
 * Class friend is a person with a name, age , and hobby.
 * 
 * @author Brian
 *
 */
public class Friend extends Person {

	private Hobby hobby;
	
	/**
	 * constructor for new Friend
	 * 
	 * @param name
	 * @param age
	 * @param hobby
	 */
	public Friend(String name, int age, Hobby hobby) {
		super(name, age);
		this.hobby = hobby;
	}
	
	/**
	 * makesa friend chill/
	 * 
	 * @return String {name} is chilling
	 */
	public String chill() {
		return this.getName() + " is chilling";
	}
	
	/**
	 * makes friends play together or alone.
	 * 
	 * @param friends
	 * @return String playing {hobby} plus any friends
	 */
	public String play(Friend[] friends) {
		if(friends.length == 0) {
			return "playing " + hobby;
		} else if (friends.length == 1) {
			return "playing " + hobby + " with " + friends[0].getName();
		} else if (friends.length == 2) {
			return "playing " + hobby + " with " + friends[0].getName() + " and " + friends[1].getName();
		} else {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < friends.length; i++) {
				if(i < friends.length - 1) {
					sb.append(friends[i].getName()).append(", ");
				} else {
					sb.append("and " + friends[i].getName());
				}
			}
			
			return "playing " + hobby + " with " + sb.toString();
		}
	}

	/**
	 * overrides toString. Returns String of the Person toString plus hobby.
	 */
	@Override
	public String toString() {
		return super.toString() + " " + hobby;
	}

}
