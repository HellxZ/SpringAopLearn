package com.cnblogs.hellxz.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 类名：AroundAspect
 * 描述：测试切面环绕处理
 * @author : Hellxz
 * @date    : 2018年9月4日
 */
@Aspect
public class AroundAspect {

	@Around("execution(* com.cnblogs.hellxz.test.Test.input(..))")
	Object tx(ProceedingJoinPoint pj) {
		
		Object object = null;
		try {
			System.out.println("事务开启……");
			
			Object[] args = pj.getArgs();
			if(args!=null && args.length > 0) {
				args[0] = "已修改+"+args[0];
			}
			
			//修改参数并放行
			object = pj.proceed(args);
			System.out.println("事务关闭……");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return object;
	}
}
