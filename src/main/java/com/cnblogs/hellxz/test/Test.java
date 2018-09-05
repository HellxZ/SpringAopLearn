package com.cnblogs.hellxz.test;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class Test {

	public void boom() throws IOException {
		throw new IOException("故意抛个异常");
	}

	public String input(String arg) {
		System.out.println("当前输入参数为："+arg);
		return arg;
	}
}
