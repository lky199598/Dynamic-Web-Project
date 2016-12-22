package com.po;

public class TestArray {
	static int fibonacciRecursion(int n)
	{
		int[] a = new int[n];
		a[0] = a[1]=1;
		for(int i=2; i<n; i++)
			a[i] = a[i-1]+a[i-2];
		
		for(int i=0; i<n; i++)
			System.out.print(a[i]+"\t");
	}
public static void main(String[] args) {
fibonacciRecursion(10);
}
}
