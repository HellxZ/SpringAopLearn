package com.cnblogs.hellxz.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * 类名：AfterAspect
 * 描述：测试切面后置处理
 * @author : Hellxz
 * @date    : 2018年9月4日
 */
@Aspect
public class AfterAspect {

	@After("execution(* com.cnblogs.hellxz.service.*.*(..))")
	public void log() {
		System.out.println("日志记录中……");
	}
}
