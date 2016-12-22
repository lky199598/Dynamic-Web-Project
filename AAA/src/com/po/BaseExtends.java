package com.po;

class A{
	void print()
	{
		System.out.println("class A");
	}
}

class B extends Test1{
	void print()
	{
		System.out.println("class B");
	}
}

public class BaseExtends {
	
 public static void main(String[] args) {
	 
	 String str = new String();
	 
	Test1 a = new Test1();
	B b = new B();
	
	Test1 a1 = (Test1)b;
	a1.print();
	
	System.out.println();
	
	B b1 = (B)a;
	b1.print();
	
}
}
