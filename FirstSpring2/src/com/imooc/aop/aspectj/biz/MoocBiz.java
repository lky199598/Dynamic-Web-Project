package com.imooc.aop.aspectj.biz;

import org.springframework.stereotype.Service;

import com.imooc.aop.aspectj.MoocMethod;


/*
@Service用于标注业务层组件

@Controller用于标注控制层组件（如struts中的action）

@Repository用于标注数据访问组件，即DAO组件

@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注
*/


@Service
public class MoocBiz{
	
	@MoocMethod(value="MoocMethod value")
	
	public String save(String arg) {
		System.out.println("MoocBiz save : " + arg+"\n");
		//throw new RuntimeException(" Save failed!");
		return " Save success!";
	}

	
}
