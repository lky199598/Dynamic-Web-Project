package com.imooc.reflect;

import java.util.List;

class AA{
	void print()
	{
		System.out.println("Use A");
	}
}

class B extends AA{
	void print()
	{
		System.out.println("Use B");
	}
}

public class TestClass {
public static void main(String[] args) {
  AA a =  new B();
  B b1 = (B)a;
  b1.print();

  
  
  B b  =  (B) new AA();
  b.print();
  
  
  List<AA> list = new ArrayList<B>();
  
}
}
