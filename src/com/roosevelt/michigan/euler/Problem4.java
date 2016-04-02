package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem4 {

	private static Logger logger = LoggerFactory.getLogger(Problem4.class);

	/**
	 * https://projecteuler.net/problem=4
	 * 
	 * 
	 * 
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int largest = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int product = i * j;
				if (isPalindrome(Integer.toString(product)) && product > largest) {
					largest = product;
				}

			}
		}

		logger.debug("largest palindrome: " + largest);
	}

	private static boolean isPalindrome(String input) {
		for (int i = 0; i < input.length() / 2; i++) {
			int end = (input.length() - i) - 1;
			if (input.charAt(i) != input.charAt(end)) {
				return false;
			}
		}

		return true;

	}

}