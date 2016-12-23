package com.beanannotation.multibean;

import com.beanannotation.injection.service.InjectionService;
import com.ioc.base.UnitTestBase;


public class TestInjection extends UnitTestBase 
{
    public TestInjection()
     {
    	super("classpath*:spring-beanannotation.xml");
    	System.out.println("Test Construction");
	}
     
	@org.junit.Test
	public void Test()
	{
		BeanInvoker beanInvoker= super.getBean("beanInvoker");		
		beanInvoker.sayList();
	}
	
	
	@org.junit.Test
	public void Test1()
	{
		BeanInvoker beanInvoker=super.getBean("beanInvoker");		
		beanInvoker.sayMap();
	}
}
