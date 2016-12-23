package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


interface Person {
	public void sayHello();
}

// 构造一个Person的实现类American，问好的时候讲英语

class American implements Person {
	@Override
	public void sayHello() {
		System.out.println("Hello,I'm American!");
	}
}

// 构造一个Person的实现类Chinese，问好的时候讲中文
class Chinese implements Person {
	private String language;
	
	public void sayHello() {
		System.out.println("你好，我是中国人！");
	}

	// 重写sayHello方法
	public void sayHello(String language) {
		this.language = language;
		System.out.println("你好，我用" + language + "问好！");
	}
}




public class class_class  {
	public void Test() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		// 第一种方式，直接new
		Person p = new Chinese();
		p.sayHello();
		
		// 第二种方式，采用反射机制获取对象
		// Class<?> c = Class.forName(".Chinese");
		Class<?> c = Class.forName("com.American");
		System.out.println("Chinese类全名:" + Chinese.class.getSimpleName());
		System.out.println("Chinese类名:" + Chinese.class.getName());
		
		Person p3 = (Person) c.newInstance();
		p3.sayHello();
		try {
			Constructor<?> constructor = Chinese.class.getConstructor(); // 获取构造方法
			
			Chinese chineseReflect = (Chinese) constructor.newInstance(); // 创建对象
			
			Method method = Chinese.class.getMethod("sayHello", String.class); // 获取方法
			
			method.invoke(chineseReflect, "中文"); // 调用方法
			
			Field field = Chinese.class.getField("language"); // 获取域
			System.out.println("Reflect -> " + field.get(chineseReflect)); // 获取域的值
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}