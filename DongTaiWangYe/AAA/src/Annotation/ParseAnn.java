package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnn {

	public static void main(String[] args)
	{
//ʹ���������������
	
	Class c = Child.class;

	//2.�ҵ��������ע��
	boolean IsExist = c.isAnnotationPresent(Description.class);
	
	System.out.print("�ҵ���"+c.getSimpleName()+"�����ע��:  ");
	if(IsExist)
	{
		//3.�õ�ע��ʵ��
		Description d = (Description)c.getAnnotation(Description.class);
		System.out.println(d.value());
	}
	
	//4.�ҵ������ϵ�ע��
	Method[] mt  = c.getMethods();
	/*
	 * Method�࣬��������
	 * һ����Ա��������һ��Method����
	 * getMethods()������ȡ�������е�public�ĺ���(���� member����)����������̳ж�����
	 */ 
	
	System.out.println("\n\nMethod:\n\n");
	for(Method m : mt)
	{
		System.out.print(m.getName()+"ע��:  ");
		boolean MethodIsExist = m.isAnnotationPresent(Description.class);
		if(MethodIsExist)
	    {
	       Description d = (Description)m.getAnnotation(Description.class);
	       System.out.print(d.value());
	    }
		System.out.println();
	}
	
	
	System.out.println("\n\nAnnotation[] at = m.getAnnotations():\n\n");
	for(Method m : mt)
	{
		System.out.print(m.getName()+"ע��:  ");
		
		Annotation[] at = m.getAnnotations();
		
		for(Annotation a : at)
		{
			if(a instanceof Description)//A��Description��ʵ��
			{
				Description d = (Description)a;
				System.out.print(d.value());
			}
		}
		System.out.println();
	}
	
	}
}
