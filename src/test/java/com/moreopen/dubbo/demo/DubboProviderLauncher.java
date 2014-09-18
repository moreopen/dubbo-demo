package com.moreopen.dubbo.demo;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations={
		"classpath:applicationContext-dubbo-provider.xml"
})
public class DubboProviderLauncher extends AbstractJUnit4SpringContextTests {

	@Test
	public void test() {
		System.out.println("============= launch demo service ....");
		while(true);
	}

}