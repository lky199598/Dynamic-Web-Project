package com.imooc.reflect;

public class ClassDemo2 {
	public static void main(String[] args) {
		
		Class c1 = int.class;//int ��������
		Class c2 = String.class;//String���������   String���ֽ��루�Լ�������)
		
		//Double ���ڶ����а�װһ���������� double ��ֵ��
		//ÿ�� Double ���͵Ķ��󶼰���һ�� double ���͵��ֶΡ� 
		Class c3 = double.class;//��������double��������
		Class c4 = Double.class;//Double���������
		Class c5 = void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());//�������������������
		System.out.println(c5.getName());
	}

}
