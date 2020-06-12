package textManipulation;

import java.util.*; 

/**
 * Takes string input from the user 
 * and as long as the input is not "done"
 * after converting to lower case, then it will 
 * print the list of park name inputs in this
 * format:
 * {park1} | {park2} | {park3}
 *  
 * @author Brian
 *
 */
public class LabTextManipulation {

	public static void main(String[] args) {
		ArrayList<String> parks = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String answer = "";
		
		while(!answer.contentEquals("done")){
			System.out.println("Please enter your favorite National Park or DONE to stop:");
			answer = scanner.nextLine().toLowerCase();
			if(!answer.contentEquals("done")) {
				parks.add(answer.toLowerCase());
			}
		}
		
		System.out.println("Favorite National Parks: " + listToString(parks));
		
	}
	
	/**
	 * Returns a formatted string with all 
	 * elements in the parks ArrayList separated
	 * by a space followed by a pipe and another space.
	 * 
	 * @param parks
	 * @return String
	 */
	private static String listToString(ArrayList<String> parks) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		
		for(String park : parks) {
			if(!first) {
				sb.append(" | ").append(updateSpelling(park));
			} else {
				sb.append(updateSpelling(park));
				first = false;
			}
		}
		
		return sb.toString();
	}
	
	/**
	 * Returns a titleized string.
	 * 
	 * @param text
	 * @return
	 */
	private static String updateSpelling(String text) {
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < text.length(); i++) {
			if(i == 0) {
				sb.append(Character.toUpperCase(text.charAt(i)));
			}else if(text.charAt(i) == ' '){
				sb.append(" ").append(Character.toUpperCase(text.charAt(i + 1)));
				i++;
			}else {
				sb.append(text.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
}
