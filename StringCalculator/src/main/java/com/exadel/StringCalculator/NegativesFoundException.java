package com.exadel.StringCalculator;

import java.util.Set;

public class NegativesFoundException extends RuntimeException {

	public NegativesFoundException(Set<Integer> negatives) {
		super("negatives not allowed: " + negatives);
	}
}