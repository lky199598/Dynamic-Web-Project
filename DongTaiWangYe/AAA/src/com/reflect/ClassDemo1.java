package com.reflect;

import java.util.ArrayList;

public class ClassDemo1 {

	private Class c1;
	private Class c2;
	private Class c3;

	public void GetClass() {
		// Foo��ʵ������
		Foo foo1 = new Foo();

		// Foo����� Ҳ��һ��ʵ������Class���ʵ������,
		// �κ�һ���඼��Class��ʵ���������ʵ�����������ֱ�ʾ��ʽ

		// ��һ�ֱ�ʾ��ʽ--->ʵ���ڸ��������κ�һ���඼��һ�������ľ�̬��Ա����class
		c1 = Foo.class;

		// �ڶ��ֱ�﷽ʽ �Ѿ�֪������Ķ���ͨ��getClass����
		c2 = foo1.getClass();

		/*
		 * ���� c1 ,c2 ��ʾ��Foo���������(class type) ��������Զ��� ��Ҳ�Ƕ�����Class���ʵ������
		 * ����������ǳ�Ϊ�����������
		 */
		// ����c1 or c2��������Foo��������ͣ�һ����ֻ������Class���һ��ʵ������
		System.out.println(c1 == c2);

		// �����ֱ�﷽ʽ
		c3 = null;
		try {
			c3 = Class.forName("com.reflect.Foo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2 == c3);

		System.out.println("Foo.class: " + c1 + "\nfoo1.getClass: " + c2
				+ "\nClass.forName('com.reflect.Foo'): " + c3);
	}

	public ArrayList<Object> GetNewInstance(Object obj)
	{
		ArrayList<Object> list = new ArrayList<Object>();
		
		Class c = obj.getClass();
		 System.out.println(c.getName() + "\n" + c.getSimpleName()+"\n");
		 
		 try {
			// ͨ����������ʹ�������Ķ���ʵ�����õ���ͬ�Ķ���---->ͨ��c1 or c2 or c3����Foo��ʵ������
			Object o1 = c.newInstance();
			Object o2 = c.newInstance();
			Object o3 = c.newInstance();
			System.out.println((o1==o2)+"\n"+(o2==o3));
			list.add(o1);
			list.add(o2);
			list.add(o3);
			
			return list;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
	}
	
	public static void main(String[] args) {
       
		Foo foo = new Foo();
		ClassDemo1 CD = new ClassDemo1();
		ArrayList<Object> list = CD.GetNewInstance(foo);
		
		for(Object obj : list)
		{
			Foo f = (Foo)obj;
			f.print();
		}
		
	}

}

class Foo{

	void print() {
		System.out.println("��ӡ�����");
	}
}
