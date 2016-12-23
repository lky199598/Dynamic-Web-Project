import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

 interface SellFisher {
    int sellFish();
    void print();
}

class ConcreteSellFisher implements SellFisher {

    public int sellFish() {
         System.out.println("my fish is delicious, price=10!!");
         return 10;
    }
     public void print()
    {
    	System.out.println("print");
    }

}

class ProxySellFisher implements InvocationHandler {

    private SellFisher sell;
    public ProxySellFisher(SellFisher sell) {
        this.sell = sell;
    }
    
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("the fish price higher");
        return method.invoke(sell, args);
    }

}


public class Useproxy {
	   public static void main(String args[]) {
	        SellFisher s = new ConcreteSellFisher();
	        InvocationHandler p = new ProxySellFisher(s);
	        
	        Object obj = Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), p);
	        ((SellFisher)obj).sellFish();
	        
	        ((SellFisher)obj).print();
	    }
}
