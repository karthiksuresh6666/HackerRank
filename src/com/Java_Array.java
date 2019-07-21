package com;

public class Java_Array {

	public static void main(String[] args) {
		String s = "                        ";
		String a[] = s.trim().split("[\\s\\!\\,\\?\\.\\_\\'\\@]+");
		if (!(s.length() > 400000)) {
			if (s.trim().length() == 0) {
				System.out.println(0);
			} else {
				System.out.println(a.length);
			}
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	}

}
