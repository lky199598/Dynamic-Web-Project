package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;  
import java.lang.annotation.RetentionPolicy;  


@Target({ElementType.FIELD})//��������ע����ĳ�Ա����
@Retention(RetentionPolicy.RUNTIME)  
/*1.SOURCE:��Դ�ļ�����Ч����Դ�ļ�������
2.CLASS:��class�ļ�����Ч����class������
3.RUNTIME:������ʱ��Ч��������ʱ������*/



public @interface Column {  
    String value();  
}  