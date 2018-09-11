package com.cnblogs.hellxz;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cnblogs.hellxz.service.Hello;
import com.cnblogs.hellxz.service.World;
import com.cnblogs.hellxz.test.Test;

public class Main {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
//		Hello hello = ctx.getBean("hello",Hello.class);
//		hello.foo();
//		hello.addUser("hellxz", "12345");
//		World world = ctx.getBean("world",World.class);
//		world.bar();
		Test bean = ctx.getBean("test", Test.class);
//		bean.boom();
//		bean.input("1234");
		bean.input("1234", 1);
	}

}
