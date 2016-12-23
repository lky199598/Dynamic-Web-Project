package com.ioc.interfaces;

public class OneInterfaceImpl implements OneInterface{

	@Override
	public String hello(String str) {
		return "实现接口，实现接口的方法的参数: "+str;		
	}	
}
