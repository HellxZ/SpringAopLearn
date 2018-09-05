package com.cnblogs.hellxz.service;

import org.springframework.stereotype.Service;

@Service
public class Hello {

	public void foo() {
		System.out.println("调用Hello的foo方法");
	}
	
	public int addUser(String name, String pass) {
		System.out.println("执行Hello的添加用户功能，用户名："+ name);
		return 'x';
	}

}
