package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PDF_Viewer {

	static int designerPdfViewer(Map<Integer, Integer> alpha, String word) {
		int highest = 0;
		for (int i = 0; i < word.length(); i++) {
			int castAscii = (int) word.charAt(i);
			if (alpha.get(castAscii) > highest) {
				highest = alpha.get(castAscii);
			}
		}
		return word.length() * highest;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int[] h = new int[26];
		Map<Integer, Integer> alpha = new HashMap<>();

		String[] hItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 26; i++) {
			int ascii = 97 + i;
			int hItem = Integer.parseInt(hItems[i]);
			h[i] = hItem;
			alpha.put(ascii, hItem);
		}

		String word = scanner.nextLine();

		int result = designerPdfViewer(alpha, word);
		System.out.println(result);
		scanner.close();
	}
}
