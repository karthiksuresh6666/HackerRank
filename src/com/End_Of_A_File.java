package com;

import java.util.Scanner;

public class End_Of_A_File {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 1;
		while (sc.hasNext()) {
			String sen = sc.nextLine();
			System.out.println(count + " " + sen);
			count++;
		}
	}

}
