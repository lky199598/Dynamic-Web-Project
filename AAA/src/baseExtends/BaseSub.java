package baseExtends;

import java.util.ArrayList;
import java.util.List;

class Base{  
	
    public void doStuff(Number n) {
    	System.out.println("Base n: "+n);
    }  
}  
  
class Sub extends Base{  
	
     public void doStuff(Integer n) {  
    	 System.out.println("Sub n: "+n);
    }  
} 


public class BaseSub
{


	public static void main(String[] args) {		
		
		Class<?> c = int.class;
		Class<?> c1 = String.class;
		
		try {			
			int n = (Integer) c.newInstance();
			System.out.println(n);
						
		}catch (InstantiationException | IllegalAccessException e) {
		
			e.printStackTrace();
		}
	

		try {		
			String str = (String) c1.newInstance();
			System.out.println("str: "+str);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		/*Base b  = new Sub();
		
		
		b.doStuff(new Integer(8));
		                                                                                                                                                                                           
		Sub s = (Sub) new Base();
		
		Number n =  new Integer(8);
		
		
		Integer n = new Integer(8);
		Integer m = new Integer(10);
		System.out.println(n.compareTo(m));
		
		System.out.println(new String("AAA").compareTo(new String("aaa")));
		
		System.out.println(new Character('A').compareTo(new Character('a')));*/
		}
}