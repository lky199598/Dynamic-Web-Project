package com.beanannotation.javabased;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import com.ioc.base.UnitTestBase;


@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase{
	
	public TestJavabased() {
		super("classpath*:spring-beanannotation.xml");
	}
	
/*	@Test
	public void test() {
		Store store = super.getBean("storeString");
		System.out.println(store.hashCode());
		
		Store s = super.getBean("storeString");
		System.out.println(s.hashCode());
	}*/
	
	
/*	@Test
	public void test1() {
		MyDriverManager store= super.getBean("myDriverManager");
		System.out.println(store.getClass().getName());
	}*/
		
	
	@Test
	public void test2() {
		Store store = super.getBean("stringStoreTest");
	}
		
}
