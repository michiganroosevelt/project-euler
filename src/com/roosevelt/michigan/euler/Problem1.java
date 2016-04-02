package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem1 {

	private static int MAX = 1000;

	private static Logger logger = LoggerFactory.getLogger(Problem1.class);

	/**
	 * 
	 * https://projecteuler.net/problem=1
	 * 
	 * 
	 * 
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * Answer: 233168
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < MAX; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		logger.debug("sum of all the multiples of 3 and 5 below " + MAX + " is: " + sum);

	}

}