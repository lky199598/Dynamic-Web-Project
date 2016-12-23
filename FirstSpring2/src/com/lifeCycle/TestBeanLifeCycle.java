package com.lifeCycle;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.ioc.base.UnitTestBase;
@RunWith(BlockJUnit4ClassRunner.class)

public class TestBeanLifeCycle extends UnitTestBase
{
	public TestBeanLifeCycle()
	{
	super("classpath*:spring-lifeCycle.xml");
	}
	
	
	@Test
	public void test()
	{
		BeanLifeCycleImpl beanLifeCycleImpl = super.getBean("BeanLifeCycleImpl");
         beanLifeCycleImpl.print();
	}
}
