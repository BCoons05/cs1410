package labJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleClassTest {

	@Test
	void isLeapYear_YearIsMultipleOf4ButNotOf100_True() {
		assertTrue(SimpleClass.isLeapYear(2024), "Years divisible by 400 should be leap years");
	}
	
	@Test
	void isLeapYear_YearIsMultipleOf100ButNotOf400_False() {
		assertFalse(SimpleClass.isLeapYear(1900), "Years divisble by 100 but not by 400 should not be leap year");
	}
	
	@Test
	void isLeapYear_YearIsMultipleOf400_True() {
		assertTrue(SimpleClass.isLeapYear(2000), "Years that can be exactly divided by 400, should be leap years.");
	}
	
	@Test
	void isLeapYear_YearIsNotMultipleOf4_False() {
		assertFalse(SimpleClass.isLeapYear(2021), "Years that are not divisible by 4 should not be leap years.");
	}
	
	@Test
	void isLeapYear_YearIsZero_ThrowsIllegalArgumentException() {
	   assertThrows(IllegalArgumentException.class, 
			   () -> {SimpleClass.isLeapYear(0);}, "Year is 0, should throw IllegalArgumentException");
	} 
	
	@Test
	void isLeapYear_YearIsNegative_ThrowsIllegalArgumentException() {
	   assertThrows(IllegalArgumentException.class, 
			   () -> {SimpleClass.isLeapYear(-400);}, "Year is negative, should throw IllegalArgumentException");
	}
	
}
