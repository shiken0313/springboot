package com.itcast.mavenTest;

import org.junit.Test;

import com.itcast.maven.Hello;

public class HelloTest {
	@Test
	public void test() {
		Hello hello = new Hello();
		
		String sayHello = hello.sayHello("maven");
		System.out.println("github����");
		System.out.println(sayHello);
	
	}
}
