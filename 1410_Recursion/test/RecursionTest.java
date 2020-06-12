import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import recursion.Recursion;

/**
 * Unit tests for Recursion challenges.
 * 
 * @author Brian
 *
 */
public class RecursionTest {
	@Test
	void sumOfDigits_SingleIntInput_5() {
		assertEquals(Recursion.sumOfDigits(5), 5);
	}
	
	@Test
	void sumOfDigits_InputZero_0() {
		assertEquals(Recursion.sumOfDigits(0), 0);
	}
	
	@Test
	void sumOfDigits_MultipleDigitInput_10() {
		assertEquals(Recursion.sumOfDigits(145), 10);
	}
	
	@Test
	void sumOfDigits_NegativeInput_15() {
		assertEquals(Recursion.sumOfDigits(-14532), 15);
	}
	
	@Test
	void sumOfDigits_InputEndsWithZero_8() {
		assertEquals(Recursion.sumOfDigits(530), 8);
	}
	
	@Test
	void sumOfDigits_MultipleZerosInMiddle_7() {
		assertEquals(Recursion.sumOfDigits(10015), 7);
	}
	
	@Test
	void sumOfDigits_EndsInZeroReturnsOne_1() {
		assertEquals(Recursion.sumOfDigits(10), 1);
	}
	
	@Test
	void sumOfDigits_RepeatingInt_5() {
		assertEquals(Recursion.sumOfDigits(11111), 5);
	}
	
	/*
	 * CountSmiles Tests
	 */
	@Test
	void countSmiles_StartsAndEndsWithOccurrence_2() {
		char[] array = {':',')',' ','L','i','f','e',' ','i','s',' ','g','o','o','d',' ',':',')'};
		assertEquals(Recursion.countSmiles(array, 0), 2);
	}
	
	@Test
	void countSmiles_RepeatingOccurrenceEndsWithSpecialChar_3() {
		char[] array = {'H','a','p','p','y',' ','D','a','y',' ',':',')',':',')',':',')','!'};
		assertEquals(Recursion.countSmiles(array, 0), 3);
	}
	
	@Test
	void countSmiles_AllColonsFollowedByInvalidChars_0() {
		char[] array = {'a',':','b','(','c',')',':',' ',')','e'};
		assertEquals(Recursion.countSmiles(array, 0), 0);
	}
	
	@Test
	void countSmiles_RepeatingDoubleValidChars_2() {
		char[] array = {':',':',')',')',':',':',')',')',':',':'};
		assertEquals(Recursion.countSmiles(array, 0), 2);
	}
	
	@Test
	void countSmiles_AllValidSequences_4() {
		char[] array = {':', ')', ':', ')', ':', ')', ':', ')'};
		assertEquals(Recursion.countSmiles(array, 0), 4);
	}
	
	@Test
	void countSmiles_ValidCharsSeparatedBySpace_0() {
		char[] array = {':', ' ', ')', ' ', ':', ' ', ')', ' '};
		assertEquals(Recursion.countSmiles(array, 0), 0);
	}
	
	@Test
	void countSmiles_FirstHalfColonsSecondParens_1() {
		char[] array = {':', ':', ':', ':', ')', ')', ')', ')'};
		assertEquals(Recursion.countSmiles(array, 0), 1);
	}
	
	@Test
	void countSmiles_EmptyArray_0() {
		char[] array = {};
		assertEquals(Recursion.countSmiles(array, 0), 0);
	}
	
	@Test
	void countSmiles_SingleCharArray_0() {
		char[] array = {':'};
		assertEquals(Recursion.countSmiles(array, 0), 0);
	}
	
	@Test
	void countSmiles_TwoCharArray_1() {
		char[] array = {':', ')'};
		assertEquals(Recursion.countSmiles(array, 0), 1);
	}
	
	/*
	 * toUpper Tests
	 */
	@Test
	void toUpper_BeginsWithCapEndsWithSpecialChar() {
		assertEquals(Recursion.toUpper("Hi there!"), "H I   T H E R E !");
	}
	
	@Test
	void toUpper_AllCaps() {
		assertEquals(Recursion.toUpper("HELLO THERE?"), "H E L L O   T H E R E ?");
	}
	
	@Test
	void toUpper_AllLowerCase() {
		assertEquals(Recursion.toUpper("howdy there!"), "H O W D Y   T H E R E !");
	}
	
	@Test
	void toUpper_SpaceThenNoSpace() {
		assertEquals(Recursion.toUpper("H it h er e !"), "H   I T   H   E R   E   !");
	}
	
	@Test
	void toUpper_AlternatesLowerThenUpperNoSpace() {
		assertEquals(Recursion.toUpper("hOwDy!!"), "H O W D Y ! !");
	}
	
	@Test
	void toUpper_ContainsNumbers() {
		assertEquals(Recursion.toUpper("Hi2 the1re!"), "H I 2   T H E 1 R E !");
	}
	
	@Test
	void toUpper_StartsAndEndsWithSpace() {
		assertEquals(Recursion.toUpper(" Hi there! "), "  H I   T H E R E !  ");
	}
	
	@Test
	void toUpper_IputIsSpaceSeparated() {
		assertEquals(Recursion.toUpper("H i  t h e r e !"), "H   I     T   H   E   R   E   !");
	}
}
