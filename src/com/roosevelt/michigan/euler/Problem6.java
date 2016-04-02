package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem6 {

	private static Logger logger = LoggerFactory.getLogger(Problem6.class);

	/**
	 * https://projecteuler.net/problem=6
	 * 
	 * 
	 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ...
	 * + 102 = 385
	 * 
	 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
	 * 10)2 = 552 = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first ten
	 * natural numbers and the square of the sum is 3025 − 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one
	 * hundred natural numbers and the square of the sum.
	 * 
	 * answer: 25164150
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long sumOfSquares = 0;
		long squareOfSum = 0;
		int MAX = 100;

		for (int i = 1; i <= MAX; i++) {
			sumOfSquares += (i * i);
			squareOfSum += i;
		}
		squareOfSum = squareOfSum * squareOfSum;

		logger.debug("difference " + (squareOfSum - sumOfSquares));
	}

}