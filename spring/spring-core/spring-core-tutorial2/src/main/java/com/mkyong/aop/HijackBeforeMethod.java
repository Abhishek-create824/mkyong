package com.mkyong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component("hijackBeforeMethodBean")
public class HijackBeforeMethod implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("HijackBeforeMethod : Before method hijacked!");
	}
}