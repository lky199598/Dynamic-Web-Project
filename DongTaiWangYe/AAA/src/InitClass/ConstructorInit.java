package InitClass;

 /*
  * 由此可见，先初始化变量，其次构造方法，另外，w3这个引用被初始化两次。
  */
class Window{  
    Window(int marker){  
        System.out.println("Windows("+marker+")");  
    }  
}  
class House{  
    Window w1=new Window(1);  
    
    House(){  
        System.out.println("House()");  
        w3=new Window(33);  
    }  
    
    Window w2=new Window(2);  
    
    void f(){  
        System.out.println("f()");  
    }  
    
    Window w3=new Window(3);  
}  
  
public class ConstructorInit{  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        House house=new House();  
        house.f();  
    }  
  
} 