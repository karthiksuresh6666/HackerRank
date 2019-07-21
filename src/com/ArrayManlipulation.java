package com;

import java.util.Scanner;

public class ArrayManlipulation {
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
        System.out.println(result);
	}

	static long arrayManipulation(int n, int[][] queries) {
		int a[] = new int[n];
		int l;
		int u;
		long adder;

		for (int i = 0; i < queries.length; i++) {
			l = queries[i][0];
			u = queries[i][1];
			adder = queries[i][2];
			a[l - 1] += adder;
			if (u < n) {
				a[u] -= adder;
			}
			
		}
		
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
		long max=0;
		long temp=0;
		for(int i=0;i<n;i++){
		    temp += a[i];
		    if(temp> max) max=temp;
		}
		return max;

	}
}
