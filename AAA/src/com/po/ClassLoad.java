package com.po;

class Show
{
    static final int n= 6;
	static final int m = print();
	
	{
		int x=10;
		System.out.println("Java普通代码块， x= "+x);
	}
	
	static 
	{
		int y =  20;
		System.out.println("Java静态代码块, y="+y);
	}
	
    static int print()
	{
    	System.out.println("n load");
		return 8;
	}
    
}


public class ClassLoad {

 public static void main(String[] args)
 {
	 System.out.println("编译期常量");
	 System.out.println(Show.n);
	 
	 System.out.println("\n运行期常量");
	 System.out.println(Show.m);
	 
 }
 
}
