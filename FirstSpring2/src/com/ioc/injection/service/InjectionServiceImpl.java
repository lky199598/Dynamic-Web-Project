package com.ioc.injection.service;

import com.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService 
{
	private InjectionDAO injDao;

	//构造器注入
	public InjectionServiceImpl(InjectionDAO injDao)
	{
	   this.injDao = injDao;	
	}
	
	//投值注入
	public void setInjDao(InjectionDAO injDao) {
		this.injDao = injDao;
	}

	@Override
	public void save(String arg)
	{
		arg += ", " + hashCode();
		injDao.save(arg);
	}
}
