package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem9 {

	private static Logger logger = LoggerFactory.getLogger(Problem9.class);

	/**
	 * 
	 * https://projecteuler.net/problem=9
	 * 
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which, a2 + b2 = c2
	 * 
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 * 
	 *  answer: 31875000
	 *  a = 200
	 *  b = 375
	 *  c = 425
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		int foundA = 0;
		int foundB = 0;
		int foundC = 0;

		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				for (int k = 0; k < 1000; k++) {
					int a = i;
					int b = j;
					int c = k;
					if (a + b + c != 1000) {
						continue;
					}
					if (a > b || a > c) {
						continue;
					}

					if (b > c) {
						continue;
					}

					long aSquared = a * a;
					long bSquared = b * b;
					long cSquared = c * c;
					if ((aSquared + bSquared) == cSquared) {
						foundA = a;
						foundB = b;
						foundC = c;
						break;
					}
				}
			}
		}

		logger.debug("found it: a = " + foundA + ", b = " + foundB + ", c = " + foundC + " product: "
				+ (foundA * foundB * foundC));
	}

}