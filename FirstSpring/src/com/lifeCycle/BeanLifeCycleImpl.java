package com.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleImpl implements InitializingBean, DisposableBean{
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destory()");
		
	}
	
	public void print()
	{
		System.out.println("BeanLifeCycleImpl");
	}
	
/*	@Override
	public void init() {//public abstract
		System.out.println("Bean Init");
		
	}
	
	@Override
	public void destory() {
		System.out.println("Bean destory");		
	}*/

}
