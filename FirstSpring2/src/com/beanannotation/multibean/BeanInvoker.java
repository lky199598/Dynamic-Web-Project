package com.beanannotation.multibean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker 
{
	
	@Autowired
	private List<BeanInterface> list;
	
	@Autowired
	private Map<String, BeanInterface> map;//æŠŠidï¼ŒBeanInterfaceçš„å­�ç±»å®žä¾‹æ”¾è¿›æ�¥
	
	@Autowired
	@Qualifier("beanImplOne")
	private BeanInterface beanInterface;
	
	public void sayList()
	{
		if (null != list && 0 != list.size()) 
		{
			System.out.println("list......");
			for (BeanInterface bean : list) 
			{
				System.out.println(bean.getClass().getName());
			}
		}
		
		else 
		{
			System.out.println("List<BeanInterface> list is null !!!!!!!!!!");
		}
	}
	
	public void sayMap()
	{
		if (map != null && 0 != map.size()) 
		{
			System.out.print("Map.......");
			
			Set< Map.Entry<String, BeanInterface> > entry = map.entrySet();
			
			for (Map.Entry<String, BeanInterface>  m : entry)
			{	
				System.out.println(m.getKey()+"  , "+m.getValue().getClass().getName());
			}
		}
		
		else 
		{
			System.out.println("Map<String, BeanInterface> map is null !!!!!!!!!!");
		}
	}
	
   public void sayQualifier()
   {
	   if(beanInterface != null)
		   System.out.println(beanInterface.getClass().getName());
	   else
		   System.out.println("beanInterface is null.....");
   }
	
}
