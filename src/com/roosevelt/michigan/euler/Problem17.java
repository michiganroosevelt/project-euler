package com.roosevelt.michigan.euler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem17 {

	private static Logger logger = LoggerFactory.getLogger(Problem17.class);

	private static String[] singles = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine" };
	private static String[] teens = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "seventeen", "eighteen", "nineteen" };
	private static String[] tens = new String[] { "xxx", "xxx", "twenty", "thirty", "forty", "fifty", "sixty",
			"seventy", "eighty", "ninety" };
	private static String hundred = "hundred";

	/**
	 * https://projecteuler.net/problem=17
	 * 
	 * If the numbers 1 to 5 are written out in words: one, two, three, four,
	 * five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
	 * 
	 * If all the numbers from 1 to 1000 (one thousand) inclusive were written
	 * out in words, how many letters would be used?
	 * 
	 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
	 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains
	 * 20 letters. The use of "and" when writing out numbers is in compliance
	 * with British usage.
	 * 
	 * 
	 * answer: 21140
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int MAX = 1000;
		int totalLetters = 0;
		for (int i = 1; i <= MAX; i++) {
			String word = getWrittenNumber(Integer.toString(i));
			String letters = word.replace(" ", "");
			letters = letters.replace("-", "");
			totalLetters += letters.length();
			logger.debug(i + " is " + word + " length is " + letters.length());
		}

		logger.debug("total letters " + totalLetters);
	}

	public static String getWrittenNumber(String input) {
		return getWrittenNumber(input, new StringBuilder());
	}

	public static String getWrittenNumber(String input, StringBuilder sb) {
		if (input.length() == 4) {
			return "one thousand";
		}

		if (input.length() == 3) {
			int hundreds = Integer.parseInt(input.substring(0, 1));
			sb.append(singles[hundreds] + " " + hundred + " and ");
			input = input.substring(1, input.length());
			return getWrittenNumber(input, sb);
		}

		if (input.length() == 2) {
			int value = Integer.parseInt(input);
			int ten = Integer.parseInt(input.substring(0, 1));
			int ones = Integer.parseInt(input.substring(1));
			if (value >= 20) {
				if (ones == 0) {
					sb.append(tens[ten]);
				} else {
					sb.append(tens[ten] + "-");
				}
			} else if (value < 20 && value >= 10) {
				if (ones == 0) {
					sb.append("ten");
				} else {
					sb.append(teens[ones]);
				}
				return sb.toString();
			}
			input = input.substring(1, input.length());
			return getWrittenNumber(input, sb);
		}

		if (input.length() == 1) {
			int value = Integer.parseInt(input);
			sb.append("" + singles[value]);
			return sb.toString();
		}

		return "";
	}

}