package com.imooc.aop.api;


public class BizLogicImpl implements BizLogic {
	
	public String save() {
		System.out.println("\nBizLogicImpl : BizLogicImpl save.");
				return "BizLogicImpl save.";
				//throw new RuntimeException();
	}

}
