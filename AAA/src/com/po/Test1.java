package com.po;

class R  implements Comparable<Test1>
{
	Object print()
	{
		return new Object();
	}

	@Override
	public int compareTo(Test1 o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class G  extends R implements Comparable<Test1>
{
	String print()
	{
		return "dhvkjdh";
	}
}

class how<T>
{
	public static <T> T print(T parameter)
	{
		return parameter;
	}	
}

public class Test1{
	public static void main(String[] args) {
	/*	how<String> s = new how<String>();
		int n = s.print(new Integer(8));
		System.out.println(n);*/
		
		int[] a = new int[10];
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);

	}
}
