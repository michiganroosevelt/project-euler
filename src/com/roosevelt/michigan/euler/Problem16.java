package com.roosevelt.michigan.euler;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem16 {

	private static Logger logger = LoggerFactory.getLogger(Problem16.class);

	/**
	 * 
	 * 
	 * https://projecteuler.net/problem=16
	 * 
	 * 
	 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * 
	 * What is the sum of the digits of the number 21000?
	 * 
	 * 
	 * answer: 1366
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int MAX = 1000;
		BigInteger big = new BigInteger("2");

		big = big.pow(MAX);
		String number = big.toString();

		long total = 0;
		for (int i = 0; i < number.length(); i++) {
			total += Integer.parseInt(Character.toString(number.charAt(i)));
		}

		logger.debug("found it " + total);
	}

}