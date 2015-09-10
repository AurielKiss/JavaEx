package com.exadel.StringCalculator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringCalculator {
	private static final Logger LOG = LogManager
			.getLogger(StringCalculator.class);

	private static final String DELIMITER = ",|\n";

	public int add(String numbers){
		if (numbers.isEmpty()) {
			LOG.debug("Got empty numbers, returning 0");
			return 0;
		}

		String delimiter = getDelimiter(numbers);
		int sum = calculateSum(delimiter, numbers);

		return sum;
	}

	private int calculateSum(String delimiter, String numbers) {
		try (Scanner charScanner = new Scanner(numbers)) {

			charScanner.useDelimiter(delimiter);

			if (numbers.startsWith("//")) {
				charScanner.nextLine();
			}

			int sum = 0;

			Set<Integer> negatives = new HashSet<Integer>();
			while (charScanner.hasNext()) {
				int number = Integer.parseInt(charScanner.next());
				if (number < 0) {
					negatives.add(number);
				}

				if (number <= 1000) {
					sum += number;
				}
			}
			
			if (!negatives.isEmpty()) {
				throw new NegativesFoundException(negatives);
	
			}
			//SimpleRuntimeException negativeObj = new SimpleRuntimeException(negatives);

			return sum;
		}
	}

	private String getDelimiter(String numbers) {
		try (Scanner firstLineScanner = new Scanner(numbers)) {

			String firstLine = firstLineScanner.nextLine();
			if (firstLine.startsWith("//")) {
				char newDelimiter = firstLine.charAt(2);
				LOG.debug("returning delimiter" + newDelimiter);
				return String.valueOf(newDelimiter);

			} else {
				LOG.debug("returning default delimiter");
				return DELIMITER;
			}
		}
	}
//Git test
	/**
	 * Should throw custom runtime exception. Which itself contains negative numbers.
	 */
//	private void negativeCheckWithErrorThrow(Set<Integer> negatives)
//			throws Exception {
//		if (!negatives.isEmpty()) {
//			LOG.error("Found negative numbers, throwing error. Negatives: "
//					+ negatives);
//			throw new Exception("negatives not allowed: " + negatives);
//		}
//	}
	
}