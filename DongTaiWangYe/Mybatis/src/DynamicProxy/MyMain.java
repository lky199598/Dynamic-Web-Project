package DynamicProxy;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class MyMain {
public static void main(String[] args) {
	System.out.println("����������Ϣ......");
	System.out.println("ͨ������������Ϣ����һ����������");
    System.out.println("���Map��ŵ��� �ӿ�Class���Ӧ�Ĵ�������ʱ");
    
    SqlSession sqlSession = new SqlSession();
    
    MyInterface myInterface = sqlSession.getMapper(MyInterface.class);
    List<Object> list = myInterface.query(new Object());
    System.out.println(list.size());   
}
}