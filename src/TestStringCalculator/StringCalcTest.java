package TestStringCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import StringCalculator.StringCalc;

class StringCalcTest {

	@Test
	public void emptyString() {
		assertEquals(0, StringCalc.add1(""));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, StringCalc.add1("1,2"));
	}

	@Test
	public void testNewLine() {
		assertEquals(6, StringCalc.add1("1\n2,3"));
	}

	@Test
	public void testDiffDelimiter() {
		assertEquals(3, StringCalc.add1("//;\n1;2"));
	}
	
	@Test
    public void testNegativeNumbers(){
    	try {
    		StringCalc.add1("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			StringCalc.add1("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }
	@Test
    public void testBiggerThanThousand(){
    	assertEquals(2, StringCalc.add1("1000,2"));
    }



}
