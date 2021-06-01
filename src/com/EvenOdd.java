package com;

/**
 * @author Karthik Suresh
 *
 */
public class EvenOdd {

	public static void main(String[] args) {
		String str = "676544376";
		StringBuilder finalstring = new StringBuilder();

		int length = str.length();
		for (int i = 0; i < length-1; i++) {
			int first = Integer.parseInt(""+str.charAt(i));
			int second = Integer.parseInt(""+str.charAt(i + 1));
			if ((first % 2 == 0) && (second % 2 == 0)) {
				finalstring.append(str.charAt(i));
				finalstring.append("*");
			} else if ((first % 2 != 0) && (second % 2 != 0)) {
				finalstring.append(str.charAt(i));
				finalstring.append("-");
			} else {
				finalstring.append(str.charAt(i));
			}
		}
		System.out.println(finalstring.append(str.charAt(length-1)));
	}

}
