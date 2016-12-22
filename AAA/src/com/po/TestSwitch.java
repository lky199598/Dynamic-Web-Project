package com.po;

import java.util.ArrayList;

public class TestSwitch {



	static void print(int n)
	{
		switch (n) {
		case 1:
			System.out.println("1");
			
		case 2:
			System.out.println("2");
			
		case 3:
			System.out.println("3");
		
		
		default:
			break;
		}
		
	}
	
	public static void main(String[] args) {
		print(2);
	}
}
