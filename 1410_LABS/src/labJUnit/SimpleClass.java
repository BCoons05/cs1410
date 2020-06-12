package labJUnit;

/**
 * Simple class to demonstrate automated testing with JUnit Jupiter (JUnit 5).
 * 
 * @author Brian
 *
 */
public class SimpleClass {

   /**    
   * Determines whether a given year is a leap year.    
   * <p>    
   * @param y year     
   * @return true if <code>year</code> is a leap year and false otherwise.    
   * @throws IllegalArgumentException if <code>year</code> is not positive.   
   */
   public static boolean isLeapYear(int year) {
	   if(year <= 0) {
		   throw new IllegalArgumentException();
	   }
	   else if(year % 400 == 0) {
		   return true;
	   } else if(year % 100 == 0) {
		   return false;
	   } else if(year % 4 == 0) {
		   return true;
	   } else {
		   return false;
	   }
   }
}
