package com.po;

class Show
{
    static final int n= 6;
	static final int m = print();
	
	{
		int x=10;
		System.out.println("Java��ͨ����飬 x= "+x);
	}
	
	static 
	{
		int y =  20;
		System.out.println("Java��̬�����, y="+y);
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
	 System.out.println("�����ڳ���");
	 System.out.println(Show.n);
	 
	 System.out.println("\n�����ڳ���");
	 System.out.println(Show.m);
	 
 }
 
}
