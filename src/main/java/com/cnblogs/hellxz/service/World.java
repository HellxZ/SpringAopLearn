package com.cnblogs.hellxz.service;

import org.springframework.stereotype.Service;

@Service
public class World {

	public void bar() {
		System.out.println("执行World组件的bar方法");
	}
}
