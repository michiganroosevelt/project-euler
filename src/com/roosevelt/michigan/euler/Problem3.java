package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem3 {

	private static Logger logger = LoggerFactory.getLogger(Problem3.class);
	
	private static long MAX = 600851475143l;
//	private static long MAX = 13195l;
	
	 

	/**
	 * https://projecteuler.net/problem=1
	 * 
	 * 
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
	 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * Answer: 6857
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		long largest = 0;
		for( int i = 2; i < MAX; i++ ) {
			if( i % 10000000 == 0 ) {
				logger.debug( "running index: " + i );
			}
			if( isPrime(i) && MAX % i == 0) {
				logger.debug( "found prime factor for " + MAX + ": " + i);
				largest = i;
			}
		}
		
		logger.debug( "largest prime factor of " + MAX + " is " + largest);
		
	}

	private static boolean isPrime(long input) {
		if( input % 2 == 0 ) {
			return false;
		}
		
		for (int i = 3; i*i < input; i+=2) {
			if( input % i == 0 ) {
				return false;
			}
		}

		return true;
	}

}