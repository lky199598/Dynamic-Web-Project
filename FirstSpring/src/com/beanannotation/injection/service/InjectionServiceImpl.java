package com.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beanannotation.injection.dao.InjectionDAO;

@Service  //用于注解服务层
public class InjectionServiceImpl implements InjectionService {
	
//	@Autowired //注解成员变量
	private InjectionDAO injectionDAO;
	
	
	@Autowired //Autowired用于构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO)
    {
 		this.injectionDAO = injectionDAO;
 	}
	
//	@Autowired  //注解setter方法
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}


	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service接收参数：" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
	
}
