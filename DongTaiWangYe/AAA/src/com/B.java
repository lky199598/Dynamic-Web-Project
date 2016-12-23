package com;

class A
{
	public A()
	{
	System.out.println("A");
	}
	
	{
		
		System.out.println("I'm A");
	}
	
	static
	{
	System.out.println("static A");
	}
}


public class B extends A{
	public  B() {
		System.out.println("B");
	}
	
	{
		System.out.println("I'm B");
	}
	
	static
	{
		System.out.println("static B");
	}
	
	public static void  main(String[] args) {
		String s1 = new String("aaa");
		String s2 = new String("aaa");
		System.out.println(s1==s2);//false
		
		//96321  96321 
		System.out.println(s1.hashCode()+"\t"+s2.hashCode());
	}
		

}
