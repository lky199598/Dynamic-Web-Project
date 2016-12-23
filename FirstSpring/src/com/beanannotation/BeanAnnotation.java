package com.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope //作用域
@Component //一个通用注解，可用于任何bean
public class BeanAnnotation {
	
	public void say(String arg) {
		System.out.println("BeanAnnotation : " + arg);
	}
	
	public void myHashCode() {
		System.out.println("BeanAnnotation hashCode(): " + hashCode());
	}
	
}
