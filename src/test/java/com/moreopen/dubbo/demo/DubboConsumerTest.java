package com.moreopen.dubbo.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations={
	"classpath:applicationContext-dubbo-consumer.xml"	
})
public class DubboConsumerTest extends AbstractJUnit4SpringContextTests {

	@Resource
	private DemoService demoService;
	
	ExecutorService executor = Executors.newFixedThreadPool(30);
	
	@Test
	public void test() {
		for (int i = 0; i < 100000; i++) {
			executor.execute(new Runnable() {
				
				@Override
				public void run() {
					String result = demoService.echo("yekai");
					System.out.println("result : " + result);
				}
			});
		}
		while(true);
	}
}
