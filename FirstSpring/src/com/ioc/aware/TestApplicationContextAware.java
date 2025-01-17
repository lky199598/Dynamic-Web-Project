package com.ioc.aware;

import com.ioc.base.UnitTestBase;
import com.ioc.injection.service.InjectionService;

public class TestApplicationContextAware extends UnitTestBase 
{
    public TestApplicationContextAware()
     {
    	super("classpath*:spring-aware.xml");
    	System.out.println("Test Construction");
	}
     
    
/*	@org.junit.Test
	public void Test()
	{
		 MyApplicationContextAware myApplicationContextAware = super.getBean("myApplicationContextAware");
		 System.out.println("TestApplicationContextAware: "+myApplicationContextAware);
	}
	*/
	
	@org.junit.Test
	public void Test()
	{
		 BeanName beanName = super.getBean("myBeanName");
		 System.out.println("Test: "+beanName);
	}
}
