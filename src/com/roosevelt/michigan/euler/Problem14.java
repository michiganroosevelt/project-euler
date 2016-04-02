package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem14 {

	private static Logger logger = LoggerFactory.getLogger(Problem14.class);

	/**
	 * 
	 * https://projecteuler.net/problem=14
	 * 
	 * The following iterative sequence is defined for the set of positive
	 * integers:
	 * 
	 * n --> n/2 (n is even) n --> 3n + 1 (n is odd)
	 * 
	 * Using the rule above and starting with 13, we generate the following
	 * sequence: 13 --> 40 --> 20 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1
	 * 
	 * It can be seen that this sequence (starting at 13 and finishing at 1)
	 * contains 10 terms. Although it has not been proved yet (Collatz Problem),
	 * it is thought that all starting numbers finish at 1.
	 * 
	 * Which starting number, under one million, produces the longest chain?
	 * 
	 * NOTE: Once the chain starts the terms are allowed to go above one
	 * million.
	 * 
	 * answer: 837799
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		long MAX = 1000000;
		long highest = 0;
		long current = 0;
		long startingPoint = 0;

		for (long i = 0; i <= MAX; i++) {
			current = getCollatzCount(i);
			if (current >= highest) {
				highest = current;
				startingPoint = i;
			}
		}

		logger.debug("found highest with starting point: " + startingPoint + " sequence count: " + highest);

	}

	private static long getCollatzCount(long input) {
		long counter = 1;
		while (input > 1) {
			counter++;
			if (input % 2 == 0) {
				input = input / 2;
			} else {
				input = (input * 3) + 1;
			}
		}

		return counter;
	}

}