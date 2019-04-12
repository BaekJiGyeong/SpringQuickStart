package com.kt.jigyeong.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	
	@Pointcut("execution(* com.kt.jigyeong..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.kt.jigyeong..*Impl.get*(..))")
	public void getPointcut() {}
}
