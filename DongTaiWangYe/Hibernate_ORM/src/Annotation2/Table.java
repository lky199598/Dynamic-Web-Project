package Annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*1.CONSTRUCTOR:��������������
2.FIELD:����������
3.LOCAL_VARIABLE:���������ֲ�����
4.METHOD:������������
5.PACKAGE:����������
6.PARAMETER:������������
7.TYPE:���������ࡢ�ӿ�(����ע������) ��enum����*/

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
//���ã���ʾ��Ҫ��ʲô���𱣴��ע����Ϣ����������ע����������ڣ�������������ע����ʲô��Χ����Ч��
//RUNTIME:������ʱ��Ч��������ʱ������


public @interface Table {

	String value();

}
