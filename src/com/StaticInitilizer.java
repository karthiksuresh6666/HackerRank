package com;

import java.util.Scanner;

public class StaticInitilizer {

	public static Scanner sc = new Scanner(System.in);

	static int B;
	static int H;
	static boolean flag;
	static {
		B = sc.nextInt();
		H = sc.nextInt();
		if (B > 0 && H > 0) {
			flag = true;
		} else {
			flag = false;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
		else{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
}
