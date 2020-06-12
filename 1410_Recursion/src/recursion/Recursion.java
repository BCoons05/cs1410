package recursion;

/**
 * recursion code challenges
 * 
 * @author Brian
 *
 */
public class Recursion {
	
	/**
	 * Returns sum of all digits in given int.
	 * 
	 * @param n
	 * @return sum of all the digits as int
	 */
	public static int sumOfDigits(int n) {
	  if(n == 0){
	    return 0;
	  } else if (n < 0) {
		n = Math.abs(n);
		return (n % 10) + (sumOfDigits(n / 10));
	  } else {
	    return (n % 10) + (sumOfDigits(n / 10));
	  }
	}
	
	/**
	 * Counts the number of colons followed by a closing parenthesis.
	 * 
	 * @param letters
	 * @param index
	 * @return Count of colon followed by parens.
	 */
	public static int countSmiles(char[] letters, int index) {
	  if(index >= letters.length - 1){
	    return 0;
	  } else if(letters[index] == ':' && letters[index + 1] == ')'){
	    return 1 + countSmiles(letters, index + 1);
	  }else{
	    return countSmiles(letters, index + 1);
	  }
	}
	
	/**
	 * Separates all characters by a space and changes all lowercase letters to uppercase letters.
	 * 
	 * @param str
	 * @return Formatted String
	 */
	public static String toUpper(String str) {
		if(str.length() == 0) {
			return str;
		} else if (str.length() == 1){
			return Character.toUpperCase(str.charAt(0)) + toUpper(str.substring(1, str.length()));
		} else {
			return Character.toUpperCase(str.charAt(0)) + " " + toUpper(str.substring(1, str.length()));
		}
	}
}
