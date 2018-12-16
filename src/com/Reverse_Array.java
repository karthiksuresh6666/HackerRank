package com;

public class Reverse_Array {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 4, 3, 2 ,7};
		int length = a.length;
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[length - (1 + i)];
			a[length - (1 + i)] = temp;
		}
	}

}
