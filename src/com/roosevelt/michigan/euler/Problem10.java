package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem10 {

	private static Logger logger = LoggerFactory.getLogger(Problem10.class);

	/**
	 * 
	 * https://projecteuler.net/problem=10
	 * 
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * 
	 * Find the sum of all the primes below two million.
	 * 
	 * answer: 142913828922
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int MAX = 2000000;
		long sum = 0;

		for (int i = 2; i <= MAX; i++) {
			if (i % 10000 == 0) {
				logger.debug("at " + i);
			}

			if (isPrime(i)) {
				sum += i;
			}
		}

		logger.debug("found it: " + sum);

	}

	private static boolean isPrime(long input) {
		if (input == 2) {
			return true;
		}

		if (input % 2 == 0) {
			return false;
		}

		if (input % 2 == 0) {
			return false;
		}

		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				return false;
			}
		}

		return true;
	}

}