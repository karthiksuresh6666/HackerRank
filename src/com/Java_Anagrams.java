package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Anagrams {

	static boolean isAnagram(String a, String b) {
		int al = a.length();
		int bl = b.length();
		Map<Character, Integer> am = new HashMap<>();
		Map<Character, Integer> bm = new HashMap<>();
		boolean isAnagram = false;
		if (al != bl) {
			return isAnagram;
		} else {
			for (int i = 0; i < al; i++) {
				mapper(a, am, i);
				mapper(b, bm, i);
			}
			for (Map.Entry<Character, Integer> entry : am.entrySet())
				if (am.get(entry.getKey()) == bm.get(entry.getKey())) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}
		}

		return isAnagram;
	}

	private static void mapper(String a, Map<Character, Integer> am, int i) {
		char c = Character.toLowerCase(a.charAt(i));
		if (am.containsKey(c)) {
			int value = am.get(c);
			am.put(a.charAt(i), ++value);
		} else {
			am.put(c, 1);
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
