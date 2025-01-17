package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

interface IHello1{
	/**
	 * 业务方法
	 * 
	 * @param str
	 */
	void sayHello(String str);
}

/*
 * 目标类代码：
 */
class Hello1 implements IHello1{
	@Override
	public void sayHello(String str) {
		System.out.println("hello " + str);
	}
}


interface ILogger{
	void start(Method method);
	void end(Method method);
}
/*
 * 操作者
 */
class DLogger implements ILogger {
	@Override
	public void start(Method method) {
		System.out.println(new Date()+"  " + method.getName()
				+ ":say hello start...");
	}

	@Override
	public void end(Method method) {
		System.out.println(new Date() +"  "+method.getName() + " :say hello end");
	}
}

class  DynaProxyHello1  implements InvocationHandler{
	// 目标对象
	private Object target;
		
	// 调用对象
	private Object ivoke;
	

	public Object bind(Object target, Object ivoke) {
		this.target = target;
		this.ivoke = ivoke;
		
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
				this.target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		
		// 反射得到操作者的实例
		Class clazz = ivoke.getClass();
		
		// 反射得到操作者的Start方法
		Method start = clazz.getDeclaredMethod("start",
				new Class[] { Method.class });
		// 反射执行start方法
		start.invoke(ivoke, new Object[]{ method});
		
		// 执行要处理对象的原本方法
		result=method.invoke(this.target, args);
		
		//反射得到操作者的end方法
		Method end = clazz.getDeclaredMethod("end",
				new Class[] { Method.class });
		
		//反射执行end方法
		end.invoke(ivoke, new Object[] { method });
		
		System.out.println("result: "+result);
		return result;
	}
}

public class DynaTest {
	public static void main(String[] args) {		
		IHello1 hello = (IHello1)new DynaProxyHello1().bind(new Hello1(),
				new DLogger());// 如果我们需要日志功能，则使用代理类
		// IHello hello = new Hello();//如果我们不需要日志功能则使用目标类
		hello.sayHello("明天");
	}
}
