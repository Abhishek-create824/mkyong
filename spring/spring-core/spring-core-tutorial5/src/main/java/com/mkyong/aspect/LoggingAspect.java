package com.mkyong.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect
public class LoggingAspect {
	// @Before – Run before the method execution
	// @Before("execution(* com.mkyong.customer.dao.CustomerDAO.insert(..))")
	// public void logBefore(JoinPoint joinPoint) {
	// System.out.println("logBefore() is running!");
	// System.out.println("Method name : "
	// + joinPoint.getSignature().getName());
	// System.out.println("******");
	// }

	// @After – Run after the method returned a result
	// @After("execution(* com.mkyong.customer.dao.CustomerDAO.insert(..))")
	// public void logAfter(JoinPoint joinPoint) {
	// System.out.println("logAfter() is running!");
	// System.out.println("Method name : "
	// + joinPoint.getSignature().getName());
	// System.out.println("******");
	// }

	// @AfterReturning – Run after the method returned a result, intercept the
	// returned result as well
	@AfterReturning(pointcut = "execution(* com.mkyong.customer.dao.CustomerDAO.findByCustomerId(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("logAfterReturning() is running!");
		System.out.println("Method name : "
				+ joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");
	}

	// @AfterThrowing – Run after the method throws an exception
	@AfterThrowing(pointcut = "execution(* com.mkyong.customer.dao.CustomerDAO.insert(..))", throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("logAfterThrowing() is running!");
		System.out.println("Method name : "
				+ joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");
	}

	// @Around – Run around the method execution, combine all three advices
	// above
	@Around("execution(* com.mkyong.customer.dao.CustomerDAO.insert(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("logAround() is running!");
		System.out.println("Method name : "
				+ joinPoint.getSignature().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(joinPoint.getArgs()));

		System.out.println("Around before is running!");
		joinPoint.proceed(); // continue on the intercepted method
		System.out.println("Around after is running!");

		System.out.println("******");
	}
}
