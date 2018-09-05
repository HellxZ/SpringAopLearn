package com.cnblogs.hellxz.aspect;

import java.io.IOException;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 类名：AfterThrowingAspect
 * 描述：异常抛出前处理
 * @author : Hellxz
 * @date    : 2018年9月4日
 */
@Aspect
public class AfterThrowingAspect {

	@Pointcut("execution(* com.cnblogs.hellxz.test.*.*(..))")
	public void pointcut() {}
	
	@AfterThrowing(throwing="ex1", 
			pointcut="pointcut()")
	//无论异常还是错误都会记录
	public void throwing(Throwable ex1) {
		System.out.println("出现异常："+ex1);
	}
	
	@AfterThrowing(throwing="ex", 
			pointcut="pointcut()")
	//只管IOException的抛出
	public void throwing2(IOException ex) {
		System.out.println("出现IO异常: "+ex);
	}
}
