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
	public Integer A()//��дʱ�������Ϳ����Ǹ��෽���ķ������ͻ������ࡣ
	{
		return new Integer(8);
	}
	
	public Object A()//��дʱ�������Ͳ����Բ��� ���෽���ķ������ͻ������ࡣ
	                  //Ҳ�����Խ��Ƿ������Ͳ�ͬ���ж�Ϊ����
	{
		return "aaa";
	}
	
}


class Apple extends Fruit{}
class RedApple extends Apple{}


