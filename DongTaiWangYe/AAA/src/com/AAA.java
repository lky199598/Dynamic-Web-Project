package com;

public class AAA {
	public void f() {
		System.out.println("s(): "+s());
	}

	public String s() {

		return "AAA";
	}
	
	public static void main(String[] args) {
		BBB b = new BBB();
		b.f();
		System.out.println();
		AAA a = new BBB();
		a.f();
	}

}

class BBB extends AAA{
	public String s() {

		return "BBB";
	}
	
	
}

