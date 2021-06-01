package com;

import java.util.Arrays;

/**
 * @author Karthik Suresh
 *
 */
public class CommonPrefix {

	public static void main(String[] args) {
		String[] a = new String[]{"Manglore", "Banglore"};
		Arrays.sort(a);
		int s = a.length;
		int minl = Math.min(a[0].length(), a[s - 1].length());

		int i = 0;
		int startIndex = 0;
		boolean first = true;
		while (i < minl) {
			if (a[0].charAt(i) == a[s - 1].charAt(i) && first) {
				startIndex = i;
				first = false;
			}
			i++;
		}
		String hc = a[0].substring(startIndex, i);
		System.out.println(hc);
	}

}
