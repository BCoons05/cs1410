package m01;

/**
 * Main method is only here to allow for runnable jar
 * main does nothing, see comments for transform method below.
 * 
 * @author Brian
 *
 */
public class Module01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * transforms string to have leading and trailing brackets, 
	 * replaces occurrences of cs, cis, or csis with CSIS,
	 * and replaces spaces with -.
	 * 
	 * @param word
	 * @return formatted string
	 */
	public static String transform(String word) {
		StringBuilder sb = new StringBuilder();
		
		sb.append('<');
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == ' ') {
				sb.append('-');
			} else if(word.length() - i >= 4 && word.substring(i, i + 4).toLowerCase().equals("csis")) {
				sb.append("CSIS");
				i += 3;
			} else if (word.length() - i >= 2 && word.substring(i, i + 2).toLowerCase().equals("cs")) {
				sb.append("CSIS");
				i++;
			} else if (word.length() - i >= 3 && word.substring(i, i + 3).toLowerCase().equals("cis")) {
				sb.append("CSIS");
				i += 2;
			} else {
				sb.append(word.charAt(i));
			}
		}
		
		sb.append('>');
		
		return sb.toString();
	}

}
