package Annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//��������ע����ĳ�Ա����
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/*1.SOURCE:��Դ�ļ�����Ч����Դ�ļ�������
2.CLASS:��class�ļ�����Ч����class������
3.RUNTIME:������ʱ��Ч��������ʱ������*/

public @interface Column {

	String value();

}
