package com;


public class Java_String {
//madam
//kallak
	public static void main(String[] args) {
		String y = "Yes";
		String a = "kala";
		int length = a.length();
		for (int i = 0; i < length / 2; i++) {
			if (a.charAt(i) == a.charAt(length - (i+1))) {
				y = "Yes";
			} else {
				y="No";
				break;
			}
		}
		System.out.println(y);

	}

}
