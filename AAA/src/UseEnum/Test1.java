package UseEnum;

public class Test1
{
	public static void main(String[] args)
	{
		EnumTest test = EnumTest.TUE;
		// compareTo(E o)
		switch (test.compareTo(EnumTest.MON)) // �Ƚϴ�ö����ָ�������˳��
		{
		case -1:
			System.out.println("TUE �� MON ֮ǰ");
			break;
		case 1:
			System.out.println("TUE �� MON ֮��");
			break;
		default:
			System.out.println("TUE �� MON ��ͬһλ��");
			break;
		}

		// getDeclaringClass()
		System.out.println("getDeclaringClass(): "
				+ test.getDeclaringClass().getName());

		// name() �� toString()
		System.out.println("name(): " + test.name());
		
		System.out.println("toString(): " + test.toString());

		// ordinal()�� ����ֵ�Ǵ� 0 ��ʼ
		System.out.println("ordinal(): " + test.ordinal());
	}
}
