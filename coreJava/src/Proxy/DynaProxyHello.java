package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

interface IHello{
	/**
	 * ҵ�񷽷�
	 * 
	 * @param str
	 */
	void sayHello(String str);
}

/*
 * Ŀ������룺
 */
class Hello implements IHello {
	@Override
	public void sayHello(String str) {
		System.out.println("hello " + str);
	}
}

class Logger {
	public static void start() {
		System.out.println(new Date() + " say hello start...");
	}

	public static void end() {
		System.out.println(new Date() + " say hello end");
	}
}


public class DynaProxyHello implements InvocationHandler {
	private Object target;// Ŀ�����

	/**
	 * ͨ��������ʵ����Ŀ�����
	 * 
	 * @param object
	 * @return
	 */
	public Object bind(Object object) {
		this.target = object;
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
				this.target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable{
		
		Object result = null;
		Logger.start();// ���Ӷ���ķ���		
		
		// ͨ���������������Ŀ�����ķ���
		result = method.invoke(this.target, args);
		
		Logger.end();
		return result;
	}
	
	public static void main(String[] args) {
		IHello hello = (IHello) new DynaProxyHello().bind(new Hello());// ���������Ҫ��־���ܣ���ʹ�ô�����
		// IHello hello = new Hello();//������ǲ���Ҫ��־������ʹ��Ŀ����
		hello.sayHello("����");
	}
}

class Test {

}