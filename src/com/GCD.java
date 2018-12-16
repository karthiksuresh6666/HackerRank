package com;

public class GCD {

	public static void main(String[] args) {
		int[] a = { 16, 32, 96};
		int n = a.length;
		int res = gcdOfArray(a,n);
		System.out.println("GCD :"+ res);

	}

	static int gcdOfArray(int a[],int n) {
		int result = a[0];
		for (int i = 0; i < n; i++) {
			result = gcd(a[i], result); 
		}
		return result;
	}
	
	static int gcd(int a, int b) 
    { 
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    }

}
