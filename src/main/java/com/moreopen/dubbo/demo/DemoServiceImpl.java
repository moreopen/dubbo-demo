package com.moreopen.dubbo.demo;

public class DemoServiceImpl implements DemoService {

	@Override
	public String echo(String msg) {
		System.out.println("input msg : " + msg);
		return "welcome " + msg;
	}

}
