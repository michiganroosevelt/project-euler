package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem5 {

	private static Logger logger = LoggerFactory.getLogger(Problem5.class);

	/**
	 * https://projecteuler.net/problem=5
	 * 
	 * 
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of
	 * the numbers from 1 to 20?
	 * 
	 * answer: 232792560
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		boolean found = false;
		int limit = 20;
		long counter = 10;
		
		while(!found) {
			counter++;
			boolean foundIt = true;
			for( int i = 1; i < limit; i++ ) {
				if( counter % i != 0 ) {
					foundIt = false;
					break;
				}
			}

			if( foundIt ) {
				found = true;
			}
		}
		
		logger.debug("found it: " + counter);
	}

}