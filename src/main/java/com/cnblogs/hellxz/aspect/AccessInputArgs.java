package com.cnblogs.hellxz.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * <b>类名</b>: AccessInputArgs
 * <p><b>描    述</b> 测试访问形参 </p>
 *
 * <p><b>创建日期</b>: 2018/9/11 10:11 </p>
 * @author  HELLXZ 张
 * @version  1.0
 * @since  jdk 1.8
 */
@Aspect
public class AccessInputArgs {

    @Before("execution(* com.cnblogs.hellxz.test.*.*(..)) && args(arg0, arg1)")
    public void access(String arg0, String arg1){
        System.out.println("接收到的参数为arg0="+arg0+",arg1="+arg1);
    }

    @Pointcut("execution(* com.cnblogs.hellxz.test.*.*(..))")
    public void pointcut(){}
}
