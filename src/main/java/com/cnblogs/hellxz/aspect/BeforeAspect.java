package com.cnblogs.hellxz.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 类名：BeforeAspect
 * 描述：测试切面前置处理
 * @author : Hellxz
 * @date    : 2018年9月4日
 */
@Aspect
public class BeforeAspect {
	
	//定义切点
	@Pointcut("execution(* com.cnblogs.hellxz.service.*.*(..))")
	public void pointCut() {}
	
	//前置处理
	@Before("pointCut()")
	public void auth(JoinPoint jp) {
		System.out.println("模拟权限检查……");
		jp.getTarget();
	}
}
