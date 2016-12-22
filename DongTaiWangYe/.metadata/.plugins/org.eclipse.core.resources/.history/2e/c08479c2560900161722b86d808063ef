package com.ioc.beanScope;

import org.springframework.context.annotation.Bean;

import com.ioc.base.UnitTestBase;

public class TestBeanScope extends UnitTestBase{

	public TestBeanScope()
	{
		super("classpath*:spring-beanScope.xml");
	}
	
	@org.junit.Test
	public void Test()
	{
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.print();
		
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.print();
	}
}
