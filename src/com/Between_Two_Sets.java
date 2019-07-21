package com;

public class Between_Two_Sets {
	public static void main(String[] args) {
		int[] a = { 2, 4 };
		int[] b = { 16, 32, 96 };
		int f = lcm(a);
		int l = gcd(b);
		int count = 0;
		for (int i = f, j = 2; i <= l; i = f * j, j++) {
			if (l % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static int gcd(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) {
			result = gcd(result, input[i]);
		}
		return result;
	}

	private static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	private static int lcm(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) {
			result = lcm(result, input[i]);
		}
		return result;
	}

}
