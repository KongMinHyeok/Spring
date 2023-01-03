package kr.co.ch03.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {

	
	public void around1(ProceedingJoinPoint pjp) {
		
		System.out.println("횡단관심 - around1 before");
		pjp.proceed();
		System.out.println("횡단관심 - around1 after");
	}
	
	public void around1(ProceedingJoinPoint pjp) {
		
		System.out.println("횡단관심 - around1 before");
		pjp.proceed();
		System.out.println("횡단관심 - around1 after");
	}
	
}
