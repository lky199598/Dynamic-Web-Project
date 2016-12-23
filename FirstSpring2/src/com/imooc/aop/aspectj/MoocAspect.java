package com.imooc.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/*
@Aspect放在类头上，把这个类作为一个切面。
@Pointcut放在方法头上，定义一个可被别的方法引用的切入点表达式。
@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注
*/

@Component
@Aspect
public class MoocAspect {
	
	@Pointcut("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..))")
	public void pointcut() {
		System.out.println("pointcut()1111111111111111\n");
	}
	
	@Pointcut("within(com.imooc.aop.aspectj.biz.*)")
	public void bizPointcut() {}
	
	@Before("pointcut()")
	public void before() {
		System.out.println("Before."+"\n");
	}
	
	@AfterReturning(pointcut="bizPointcut()", returning="returnValue")
	public void afterReturning(Object returnValue) {
		System.out.println("AfterReturning : " + returnValue+"\n");
	}
	
	@AfterThrowing(pointcut="pointcut()", throwing="e")
	public void afterThrowing(RuntimeException e) {
		System.out.println("AfterThrowing: " + e.getMessage()+"\n");
	}
	
	

	
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Around 1.");
		Object obj = pjp.proceed();
		System.out.println("Around 2.");
		System.out.println("Around : " + obj+"\n");
		return obj;
	}
	
	@After("pointcut()")
	public void after() {
		System.out.println("After."+"\n");
	}

	@Before("pointcut() && args(arg)")
	public void beforeWithParam(String arg) {
		System.out.println("BeforeWithParam." + arg+"\n");
	}
	
	
	@Before("pointcut() && @annotation(moocMethod)")
	public void beforeWithAnnotaion(MoocMethod moocMethod) {
		System.out.println("BeforeWithAnnotation." + moocMethod.value()+"\n");
	}
	
}
