
package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem2 {

	private static int MAX = 4000000;

	private static Logger logger = LoggerFactory.getLogger(Problem2.class);

	/**
	 * https://projecteuler.net/problem=2
	 * 
	 * 
	 * 
	 * Each new term in the Fibonacci sequence is generated by adding the
	 * previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * By considering the terms in the Fibonacci sequence whose values do not
	 * exceed four million, find the sum of the even-valued terms.
	 * 
	 * Answer: 4613732
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int last = 0;
		int current = 1;
		long sum = 0;

		while (current < MAX) {
			int next = last + current;
			last = current;
			current = next;
			if( current % 2 == 0) {
				sum += current;
			}
			logger.debug(current + " ");
		}
		
		logger.debug( "sum is " + sum);
	}

}