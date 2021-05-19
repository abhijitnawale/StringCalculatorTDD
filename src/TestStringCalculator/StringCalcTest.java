package TestStringCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import StringCalculator.StringCalc;

class StringCalcTest {

	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalc.add1(" 1"));
	}
	@Test
	public void testTwoNumbers(){
		assertEquals(1, StringCalc.add1("1,2"));
	}
    
}
