package Annotation;

/*@Description("��V���ȿֻ�")*/

public class Child extends Person {

	@Override//��������
/*	@Description(value="����")*/
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Description(value="����")
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char sex() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
