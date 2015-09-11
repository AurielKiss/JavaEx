package com.exadel.StringCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
/**
 * 
 * @author Aurelijus
 *
 */
public class StringCalculatorTest {
	private final StringCalculator calculator = new StringCalculator();

	@Test
	public void testConstructor() {
		assertNotNull(calculator);
	}
	
	@Test
	public void testSumOfEmpty() {
		String number = "";

		assertEquals("Sum of null should be 0", 0, calculator.add(number));
	}

	@Test
	public void testSumOfOneNumber() {
		String number = "1";
		assertEquals("Sum of 1 should be 1", 1, calculator.add(number));
	}

	@Test
	public void testSumOfTwoNumbers() {
		String number = "1,2";
		assertEquals("Sum of 1+2 should be 3", 3, calculator.add(number));
	}

	@Test
	public void testSumOfMultipleNumbers() {
		String number = "1,2,3,10,20,30";
		assertEquals("Sum of 1+2+3+10+20+30 should be 66", 66,
				calculator.add(number));
	}

	@Test
	public void testSumOfTwoNumbersWithNewLineDelimiter() {
		String number = "1\n2";
		assertEquals("Sum of 1+2 should be 3", 3, calculator.add(number));
	}

	@Test
	public void testSumOfMultipleNumbersWithNewLineDelimiter() {
		String number = "1\n2,3";
		assertEquals("Sum of 1+2+3 should be 6", 6, calculator.add(number));
	}

	@Test
	public void testSumOfMultipleNumbersWithDifferentDelimiters() {
		String number = "//;\n1;2";
		assertEquals("Sum of 1+2 should be 3", 3, calculator.add(number));
	}

	@Test(expected = NegativesFoundException.class)
	public void testSumOfPositiveAndMultipleNegativeNumbers() {
		String number = "-1,2,-3,4";
		assertEquals("Sum of (-1)+2+(-3)+4 should be 2", 2,
				calculator.add(number));
	}

	@Test(expected = NegativesFoundException.class)
	public void testSumOfMultiplePositiveAndNegativeNumbersWithDifferentDelimiters() {
		String number = "//;\n1;-2;3";
		assertEquals("Sum of 1+(-2)+3 should be 2", 2, calculator.add(number));
	}

	@Test
	public void testSumOfMultipleBiggerThanThousandNumbers() {
		String number = "1001\n2000,3";
		assertEquals("Sum of 3 should be 3", 3, calculator.add(number));
	}

	@Test
	public void ttestSumOfMultipleBiggerThanThousandNumbers() {
		String number = "1000\n2000,3000";
		assertEquals("Sum of 1000 should be 1000", 1000, calculator.add(number));
	}
}
