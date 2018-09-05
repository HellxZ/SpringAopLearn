package com.cnblogs.hellxz.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class World {

	public void bar() {
		System.out.println("执行World组件的bar方法");
	}

	public void exception() throws IOException {
		System.out.println("执行抛出异常方法");
//		throw new RuntimeException("抛出运行时异常");
		throw new IOException("抛出IO异常");
	}
}
