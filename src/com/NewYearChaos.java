package com;

/**
 * @author Karthik Suresh
 *
 */
public class NewYearChaos {

	public static void main(String[] args) {
		printArray();

	}

	static void printArray() {
		int bribeCount = 0;
		int[] a = new int[] { 2, 1, 5, 3, 4 };
		int size = a.length;
		
		
		for (int i = size - 1; i >= 0; i--) {
			if (a[i] != i + 1) {
				if ((i - 1 >= 0) && a[i - 1] == i + 1) {
					bribeCount++;
					shift(a, i, i - 1);
				} else if ((i - 2 >= 0) && a[i - 2] == i + 1) {
					bribeCount += 2;
					shift(a, i - 2, i - 1);
					shift(a, i - 1, i);
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}

		}
		
//		for (int i = a.length - 1; i >= 0; i--) {
//
//			if (a[i] != i + 1) { // filter cases, when you do not bribe, be at the ith position wherever you are
//
//				if (((i - 1) >= 0) && a[i - 1] == (i + 1)) { // 1)Being at initial ith position, valid current
//																// position after given bribe can be (i-1)th position
//					bribeCount++;
//					shift(a, i, i - 1);
//				} else if (((i - 2) >= 0) && a[i - 2] == (i + 1)) { // 2)Being at initial ith position, valid current
//																		// position after given bribes can be (i-2)th
//																		// position
//					bribeCount += 2;
//					shift(a, i - 2, i - 1);
//					shift(a, i - 1, i);
//				} else { // 3)Too chaotic (trying to bribe more than 2 people which is ahead of you)
//					System.out.println("Too chaotic");
//					return;
//				}
//			}
//
//		}
		
		
		System.out.println(bribeCount);

	}

	private static void shift(int[] array, int a, int b) {
		int t = array[a];
		array[a] = array[b];
		array[b] = t;
	}

}
