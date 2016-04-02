package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem7 {

	private static Logger logger = LoggerFactory.getLogger(Problem7.class);

	/**
	 * https://projecteuler.net/problem=7
	 * 
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10001st prime number?
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 1;
		int test = 1;
		int MAX = 10001;

		while (counter <= MAX) {
			test++;
			if (isPrime(test)) {
				counter++;
			}
		}

		logger.debug("found it: " + test);
	}

	private static boolean isPrime(long input) {
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				return false;
			}
		}

		return true;
	}

}