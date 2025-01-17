package com.imooc.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MoocMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("\nMoocMethodInterceptor 1 : " + invocation.getMethod().getName() + "     " + 
				invocation.getStaticPart().getClass().getName());
		
		 Object obj = invocation.proceed();
		 
		 System.out.println("\nMoocMethodInterceptor 2 : " + obj);
		 return obj;
	}

}
