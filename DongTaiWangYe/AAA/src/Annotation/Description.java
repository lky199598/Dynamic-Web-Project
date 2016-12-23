package Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;


@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented

//ʹ��@interface�ؼ��ֶ���ע��
//��Ա���޲����쳣��ʽ����	
//����ʹ��defaultΪ��Աָ��һ��Ĭ��ֵ

public @interface Description {

	String value();
}
