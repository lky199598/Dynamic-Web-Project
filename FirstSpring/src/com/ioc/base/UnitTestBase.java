package com.ioc.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase 
{   
	//BeanFactory�ṩ���ýṹ�ͻ��ܣ����ز���ʼ��
	//ApplicationContext������Bean����,����spring�б��㷺ʹ��
	

	////ClassPathXmlApplicationContext��һ�����Լ������ļ�����
	private ClassPathXmlApplicationContext context;
    
	private String springXmlpath;
	
	public UnitTestBase()
	{		
	}
	
	public UnitTestBase(String springXmlpath)
	{
		System.out.println("TestBase Construction");
		this.springXmlpath = springXmlpath;
	}
	
	@Before
	public void before()
	{
		if(StringUtils.isEmpty(springXmlpath))
		{
			System.out.println("springXmlpath: "+springXmlpath);
			//classpath����㹤��������ĸ�Ŀ¼��Ҳ����srcĿ¼��classpath*���src������Ŀ¼����Ŀ¼
			springXmlpath = "classpath*:spring-*.xml";
			System.out.println("springXmlpath: "+springXmlpath);
		}
		//  \\s��ʾ   �ո�,�س�,���еȿհ׷�
		context  = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]"));
		context.start();
	}	
	
	@After
	public void after()
	{
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected<T extends Object> T getBean(String beanId)
	{
		//���Spring�ж����Beanʵ��(����)
		return (T) context.getBean(beanId);
	}
	
	protected <T extends Object> T getBean(Class<T> clazz) 
	{
		//���Spring�ж����Beanʵ��(����)
		return context.getBean(clazz);
	}
	
}
