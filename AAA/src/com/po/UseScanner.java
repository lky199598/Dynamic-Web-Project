package com.po;

import java.util.Scanner;

public class UseScanner {
	public static void main(String args[])
	{
	  Scanner in =  new Scanner(System.in);
	  
      int n = in.nextInt();
      double d = in.nextDouble();
      boolean b = in.nextBoolean();
      byte by = in.nextByte();
      String str = in.nextLine();
      
      System.out.println(n+", "+d+", "+b+", "+by+", "+str);
	}

      
      

}
