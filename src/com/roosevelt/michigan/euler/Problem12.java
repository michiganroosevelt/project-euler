package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem12 {

	private static Logger logger = LoggerFactory.getLogger(Problem12.class);

	/**
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		long counter = 0;
		long index = 0;
		int divisorCount = 0;
		int highestDivisor = 0;

		int MAX = 500;

		while (divisorCount <= MAX) {
			counter += index;
			index++;
			divisorCount = getTriangleDivisors(counter);
			if( index % 100 == 0 ) {
				logger.debug("index is " + index + ", counter is " + counter);
			}
			if( divisorCount > highestDivisor ) {
				highestDivisor = divisorCount;
				logger.debug("triangle number " + counter + " has " + divisorCount + " divisors");
			}
		}
		
		logger.debug( "found it " + counter + " has " + highestDivisor + " divisor count" );
	}

	private static int getTriangleDivisors(long input) {
		int counter = 0;
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				counter++;
			}
		}

		return counter;
	}

}