package com;

public class Star {

	public static void main(String[] args)
	{
		int n=10;
		int i, j,k;
		for(i=n-1; i>=0; i--)
		{
			for(j=0; j<i; j++)
				System.out.print(" ");
			for(k=0; k<2*(n-1-i)+1; k++)
				System.out.print("*");			
			System.out.println();
		}
		
		for(i=0; i<2;i++)
		{
			for(j=0; j<n-2; j++)
				System.out.print(" ");
			for(k=0; k<3; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
}
