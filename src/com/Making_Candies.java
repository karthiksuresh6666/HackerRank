package com;

public class Making_Candies {

	public static void main(String[] args) {
		// 3 1 2 12
		int m = 3;
		int w = 1;
		int p = 2;
		int n = 12;
		System.out.println(mc(m, w, p, n));
	}

	static int mc(int m, int w, int p, int n) {
		int count = 0;
		if ((m * (w + 1)) >= ((m + 1) * w)) {
			w = w + 1;
			
		} else {
			m = m + 1;
			
		}
		if (((m * w) - p) < n) {
			System.out.println("w:" + w);
			System.out.println("m:" + m);
			System.out.println("w*m:" + m*w);
			System.out.println("sum:" + ((m * w) - p));
			count++;
			mc(m, w, p, n);
		}
		return count;
	}

}
