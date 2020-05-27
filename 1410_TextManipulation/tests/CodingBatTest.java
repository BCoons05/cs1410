import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codingBat.CodingBat;
import labJUnit.SimpleClass;

class CodingBatTest {
	
	@Test
	void wordEnds_StringContainsTwoOccurences_c13i() {
		assertEquals(CodingBat.wordEnds("abcXY123XYijk", "XY"), "c13i");
	}
	
	@Test
	void wordEnds_StringContainsTwoOccurencesWithOneCharEach_13() {
		assertEquals(CodingBat.wordEnds("XY123XY", "XY"), "13");
	}
	
	@Test
	void wordEnds_TwoOccurencesWithSameCharReturned_11() {
		assertEquals(CodingBat.wordEnds("XY1XY", "XY"), "11");
	}
	
	@Test
	void wordEnds_TwoOccurencesWithReturnEqualInput_XY() {
		assertEquals(CodingBat.wordEnds("XYXY", "XY"), "XY");
	}
	
	@Test
	void wordEnds_NoLeadingOrTrailingChars_() {
		assertEquals(CodingBat.wordEnds("XY", "XY"), "");
	}
	
	@Test
	void wordEnds_EmptyInputString_() {
		assertEquals(CodingBat.wordEnds("", "XY"), "");
	}
	
	@Test
	void wordEnds_NumericInputReturnsLetters_cxziij() {
		assertEquals(CodingBat.wordEnds("abc1xyz1i1j", "1"), "cxziij");
	}
	
	@Test
	void wordEnds_NumericInputOneOccurenceBothOtherOnlyOneLeading_cxz() {
		assertEquals(CodingBat.wordEnds("abc1xyz1", "1"), "cxz");
	}
	
	@Test
	void wordEnds_NumericInputReturnsLettersAndNumbers_cxz11() {
		assertEquals(CodingBat.wordEnds("abc1xyz11", "1"), "cxz11");
	}
	
	@Test
	void wordEnds_ThreeLetterInputTwoOccurencesOneCharEach_11() {
		assertEquals(CodingBat.wordEnds("abc1xyz1abc", "abc"), "11");
	}
	
	@Test
	void wordEnds_OneLetterInputTwoOccurencesTwoCharEach_acac() {
		assertEquals(CodingBat.wordEnds("abc1xyz1abc", "b"), "acac");
	}
	
	@Test
	void wordEnds_ThreeOccurenceAllSharedChars_1111() {
		assertEquals(CodingBat.wordEnds("abc1abc1abc", "abc"), "1111");
	}

}
