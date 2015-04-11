package com.mkyong.aop;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Component("hijackThrowExceptionBean")
public class HijackThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}