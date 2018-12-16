package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Two_D_Array {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] a) {
		int max = 0;
		int c = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				int count = 0;
				count = a[j][i] + a[j][i + 1] + a[j][i + 2] + a[j + 1][i + 1] + a[j + 2][i] + a[j + 2][i + 1]
						+ a[j + 2][i + 2];

				if (max < count) {
					max = count;
				}
				if (c == 0) {
					max = count;
				}
				c++;
			}

		}
		return max;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
