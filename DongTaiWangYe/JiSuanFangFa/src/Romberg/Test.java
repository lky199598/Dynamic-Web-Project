package Romberg;

import java.util.Scanner;


	public class Test
	{

	    public static void main(String[] args)
	    {
	        double a, b;
	        @SuppressWarnings("resource")
	        Scanner p=new Scanner(System.in);
	        System.out.println("Romberg����,��������ַ�Χa:");
	        a=p.nextDouble();
	        System.out.println("Romberg����,��������ַ�Χb:");
	        b=p.nextDouble();
	        System.out.println("���ֽ��:");
	        System.out.println(romberg.Romberg(a, b));
	    }

	}
