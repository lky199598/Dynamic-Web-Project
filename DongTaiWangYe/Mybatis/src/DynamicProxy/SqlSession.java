package DynamicProxy;

import java.lang.reflect.Proxy;

public class SqlSession {

	public <T> T getMapper(Class<T> type)
	{
		System.out.println("ͨ�� �ӿڵ�Class ��  ��������Map ȡ����Ӧ�� ��������");
		System.out.println("ͨ���������� ʵ���� һ��������");
		System.out.println("����������� ����һ�� ����ʵ�� ���س�ȥ");
		return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, new MapperProxy());
	}
}