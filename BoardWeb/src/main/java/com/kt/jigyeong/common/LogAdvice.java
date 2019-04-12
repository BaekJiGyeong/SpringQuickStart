package com.kt.jigyeong.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // Aspect = Pointcut + Advice
public class LogAdvice {
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
	
	@Pointcut("execution(* com.kt.jigyeong..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.kt.jigyeong..*Impl.get*(..))")
	public void getPointcut() {}
}
