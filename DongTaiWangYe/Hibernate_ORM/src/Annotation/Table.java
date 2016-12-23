package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;  
import java.lang.annotation.RetentionPolicy;  

/*1.CONSTRUCTOR:��������������
2.FIELD:����������
3.LOCAL_VARIABLE:���������ֲ�����
4.METHOD:������������
5.PACKAGE:����������
6.PARAMETER:������������
7.TYPE:���������ࡢ�ӿ�(����ע������) ��enum����*/

@Target({ElementType.TYPE})//��������ע���ࡢ�ӿ�(����ע������) ��enum����
@Retention(RetentionPolicy.RUNTIME)  
//RUNTIME:������ʱ��Ч��������ʱ������

public @interface Table {  
  public String value();  
}  