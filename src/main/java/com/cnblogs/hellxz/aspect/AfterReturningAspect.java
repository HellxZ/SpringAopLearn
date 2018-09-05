package com.cnblogs.hellxz.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 类名：AfterReturningAspect
 * 描述：返回前处理
 * @author : Hellxz
 * @date    : 2018年9月4日
 */
@Aspect
public class AfterReturningAspect {

	@Pointcut("execution(* com.cnblogs.hellxz.service.*.*(..))")
	public void pointcut() {}
	
	@AfterReturning(returning="rvt",
			pointcut = "pointcut()")
	//声明rvt时指定的类型会限定目标方法的返回值类型，必须返回指定类型或者没有返回值
	//rvt类型为Object则是不对返回值做限制
	public void log(Object rvt) {
		System.out.println("获取目标返回值："+ rvt);
		System.out.println("假装在记录日志……");
	}
	
	/**
	 * 这个方法可以看出如果目标方法的返回值类型与切面入参的类型相同才会执行此切面方法
	 * @param itr
	 */
	@AfterReturning(returning="itr", 
			pointcut="pointcut()")
	public void test(Integer itr) {
		System.out.println("故意捣乱……:"+ itr);
	}
}
