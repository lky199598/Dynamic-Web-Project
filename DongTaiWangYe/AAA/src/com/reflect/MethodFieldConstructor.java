package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class MethodFieldConstructor {
	/**
	 * ��ӡ�����Ϣ��������ĳ�Ա��������Ա����(ֻ��ȡ��Ա����)
	 * @param obj �ö������������Ϣ
	 */
	public static void printClassMethodMessage(Object obj)
	{
		//Ҫ��ȡ�����Ϣ  ����Ҫ��ȡ���������
		Class c = obj.getClass();//���ݵ����ĸ�����Ķ���  c���Ǹ������������
		
		//��ȡ�������
		System.out.println("�������: "+c.getName());
		
		/*
		 * Method�࣬��������
		 * һ����Ա��������һ��Method����
		 * getMethods()������ȡ�������е�public�ĺ���(���� member����)����������̳ж�����
		 * getDeclaredMethods()��ȡ�������� �����Լ������ķ��������ʷ���Ȩ��
		 */
		Method[] mt = c.getMethods();
		
		for(int i=0; i< mt.length; i++)
		{
			//�õ������ķ���ֵ���͵�������
			Class ReturnType = mt[i].getReturnType();
			
			System.out.print(ReturnType.getName()+"  ");
			
			//�õ�����������
			System.out.print(mt[i].getName()+"(");
			
			//��ȡ��������--->�õ����ǲ����б�����͵�������
			Class[] ParamTypes = mt[i].getParameterTypes();
		    for(Class cl : ParamTypes)
		    	System.out.print(cl.getName()+",");
		    System.out.println(")");
		}
	}
	
	public static void printFieldMessage(Object obj)
	{
		Class c = obj.getClass();
		/*
		 * ��Ա����Ҳ�Ƕ���
		 * java.lang.reflect.Field
		 * Field���װ�˹��ڳ�Ա�����Ĳ���
		 * getFields()������ȡ�������е�public�ĳ�Ա��������Ϣ
		 * getDeclaredFields��ȡ���Ǹ����Լ������ĳ�Ա��������Ϣ
		 */
		//Field[] fs = c.getFields();
		Field[] field = c.getDeclaredFields();
		for(Field f : field)
		{
			//�õ���Ա���������͵�������
			Class FieldType = f.getType();
			//�õ���Ա�������������ƺͳ�Ա����������
			System.out.println(FieldType.getName()+"  "+f.getName());
			
		}
	}
	
	
	public static void printConstructorMessage(Object obj)
	{
		Class c = obj.getClass();
		/*
		 * ����
		
		* 
		 * java.lang. Constructor�з�װ�˹��캯������Ϣ
		 * getConstructors��ȡ���е�public�Ĺ��캯��
		 * getDeclaredConstructors�õ����еĹ��캯��
		 */
		Constructor[] constructor = c.getDeclaredConstructors();
	     for(Constructor con:constructor)
	     {
	    	 System.out.print(con.getName()+"(");
	    	
	    	 //��ȡ���캯���Ĳ����б�--->�õ����ǲ����б��������
	    	 Class[] ParamType = con.getParameterTypes();
	        
	    	 for(Class cl : ParamType)
	        	System.out.print(cl.getName()+",");
	    	 
	        System.out.println(")");
	     }
	
	}
	
	public static void main(String[] args)
	{
		String s = "hello";    Integer I = new Integer(2);
/*		MethodFieldConstructor.printClassMethodMessage(s);
		
		System.out.println("\n");
	
	    MethodFieldConstructor.printClassMethodMessage(I);
	*/
		
		MethodFieldConstructor.printFieldMessage(s);
		System.out.println("\n");
		MethodFieldConstructor.printFieldMessage(I);
/*		
        MethodFieldConstructor.printConstructorMessage(s);		
		System.out.println("\n");
		MethodFieldConstructor.printConstructorMessage(I)*/;
	}
	
}
