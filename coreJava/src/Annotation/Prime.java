package Annotation;

import java.util.Scanner;

public class Prime {
	
	static int  primeDistance(Integer[] arr)
	{
		int d=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				for(int j=i+1; j<arr.length; j++)
					if(arr[j]%2==0)
					{
						for(int n=arr[i]+1; n<=arr[j]-1; n++)
							if(judgePrime(n))
								d++;
					}
				
			}
		}
		return d;
		
	}

	static boolean judgePrime(int n)
	{
		for(int m=2; m<n; m++)
			if(n % m==0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入的偶数个数：");
		int n = s.nextInt();
		Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++)
        	arr[i] = s.nextInt();
        System.out.println("偶数所有数两两之间距离的总和："+primeDistance(arr));
        
        
	}
}
