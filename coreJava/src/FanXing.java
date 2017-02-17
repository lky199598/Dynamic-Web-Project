import java.util.ArrayList;


public class FanXing {
public static void main(String[] args) {
	
}
}

class Food{
	public Number A()
	{
		return new Integer(8);
	}

	
}
class Fruit extends Food{
	public Integer A()//重写时返回类型可以是父类方法的返回类型或者子类。
	{
		return new Integer(8);
	}
	
	public Object A()//重写时返回类型不可以不是 父类方法的返回类型或者子类。
	                  //也不可以仅是返回类型不同就判定为重载
	{
		return "aaa";
	}
	
}


class Apple extends Fruit{}
class RedApple extends Apple{}


