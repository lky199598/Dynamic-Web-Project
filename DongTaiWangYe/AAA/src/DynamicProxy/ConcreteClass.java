package DynamicProxy;
/*
 * ʵ�ָýӿڵ�ί����ConcreteClass:
 */
public class ConcreteClass implements TargetInterface{

	public int targetMethodA(int number) {
		System.out.println("��ʼ����Ŀ����ķ���targetMethodA...");
		System.out.println("����-��ӡ����:"+number);
		System.out.println("��������Ŀ����ķ���targetMethodA...");
		return number;
	}
	
	public int targetMethodB(int number){
		System.out.println("��ʼ����Ŀ����ķ���targetMethodB...");
		System.out.println("����-��ӡ����:"+number);
		System.out.println("��������Ŀ����ķ���targetMethodB...");
		return number;
	}

}