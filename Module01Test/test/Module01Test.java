import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codingBat.CodingBat;
import m01.Module01;

/**
 * Test cases for Module01
 * 
 * tests transform method
 * 
 * @author Brian
 *
 */
class Module01Test {

	@Test
	void transform_ContainsCs() {
		assertEquals(Module01.transform("cS 1410"), "<CSIS-1410>");
	}
	
	@Test
	void transform_ContainsCsis() {
		assertEquals(Module01.transform("CSis 1410"), "<CSIS-1410>");
	}
	
	@Test
	void transform_ContainsCis() {
		assertEquals(Module01.transform("cis 1410"), "<CSIS-1410>");
	}
	
	@Test
	void transform_ContainsCsInMiddle() {
		assertEquals(Module01.transform("HicS 1410"), "<HiCSIS-1410>");
	}
	
	@Test
	void transform_EmptyStringInput() {
		assertEquals(Module01.transform(""), "<>");
	}
	
	@Test
	void transform_NoCSISshortString() {
		assertEquals(Module01.transform("Hi"), "<Hi>");
	}
	
	@Test
	void transform_LeadingAndTrailingBrackets() {
		assertEquals(Module01.transform("<cS 1410>"), "<<CSIS-1410>>");
	}
	
	@Test
	void transform_UnderScoreInsteadOfSpaces() {
		assertEquals(Module01.transform("cS_1410"), "<CSIS_1410>");
	}
	
	@Test
	void transform_RepeatingCsisFormsOnly() {
		assertEquals(Module01.transform("cSCIsCsIS"), "<CSISCSISCSIS>");
	}
	
	@Test
	void transform_DoubleSpaceWithAlmostMatchedPhrase() {
		assertEquals(Module01.transform("cSi  1410"), "<CSISi--1410>");
	}
	
	@Test
	void transform_MultipleSpaceSeparators() {
		assertEquals(Module01.transform(" cScs 14 10 "), "<-CSISCSIS-14-10->");
	}
	
	@Test
	void transform_NoMatchingCSISPhrases() {
		assertEquals(Module01.transform("cici is si "), "<cici-is-si->");
	}
}
