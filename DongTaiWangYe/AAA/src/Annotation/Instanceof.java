package Annotation;

public class Instanceof {
   public static void main(String[] args )
   {
	   String str = new String();
	   if(str instanceof String)
		   System.out.println("String��ʵ��");
	   else
		   System.out.println("����String��ʵ��");
	   
	   Integer n = null;
	   
	   if(n instanceof Integer)
		   System.out.println("Integer��ʵ��");
	   else
		   System.out.println("����Integer��ʵ��");
   }
}
