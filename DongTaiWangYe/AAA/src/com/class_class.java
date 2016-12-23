package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


interface Person {
	public void sayHello();
}

// ����һ��Person��ʵ����American���ʺõ�ʱ��Ӣ��

class American implements Person {
	@Override
	public void sayHello() {
		System.out.println("Hello,I'm American!");
	}
}

// ����һ��Person��ʵ����Chinese���ʺõ�ʱ������
class Chinese implements Person {
	private String language;
	
	public void sayHello() {
		System.out.println("��ã������й��ˣ�");
	}

	// ��дsayHello����
	public void sayHello(String language) {
		this.language = language;
		System.out.println("��ã�����" + language + "�ʺã�");
	}
}




public class class_class  {
	public void Test() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		// ��һ�ַ�ʽ��ֱ��new
		Person p = new Chinese();
		p.sayHello();
		
		// �ڶ��ַ�ʽ�����÷�����ƻ�ȡ����
		// Class<?> c = Class.forName(".Chinese");
		Class<?> c = Class.forName("com.American");
		System.out.println("Chinese��ȫ��:" + Chinese.class.getSimpleName());
		System.out.println("Chinese����:" + Chinese.class.getName());
		
		Person p3 = (Person) c.newInstance();
		p3.sayHello();
		try {
			Constructor<?> constructor = Chinese.class.getConstructor(); // ��ȡ���췽��
			
			Chinese chineseReflect = (Chinese) constructor.newInstance(); // ��������
			
			Method method = Chinese.class.getMethod("sayHello", String.class); // ��ȡ����
			
			method.invoke(chineseReflect, "����"); // ���÷���
			
			Field field = Chinese.class.getField("language"); // ��ȡ��
			System.out.println("Reflect -> " + field.get(chineseReflect)); // ��ȡ���ֵ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}