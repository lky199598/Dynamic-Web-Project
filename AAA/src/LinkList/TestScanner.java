package LinkList;

import java.util.Scanner;

public class TestScanner {
   static  void  print1()
   {
	   Scanner in =  new Scanner(System.in);
	   int n =  in.nextInt();
	   System.out.println(n);
	   in.close();
   }
   
   static void print2()
   {
	   Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
	   System.out.println(n);
	   in.close();
   }
   
   public static void main(String[] args) {
	print1();
   }
}
