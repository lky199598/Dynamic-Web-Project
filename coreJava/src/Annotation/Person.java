package Annotation;

/*public interface Person {

	public String name();
	
	public int age();
	
	@Deprecated//��ʱ
	public char sex();
}*/

@Description("����һ������")
public class Person {

	@Description("����һ�����෽��")
	public String name(){
		return null;
	}
	
	public int age(){
		return 0;
	}
	
	@Deprecated//��ʱ
	public char sex(){
		return 0;
	}
}
