package fr.dta.annotation_spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GetMethodNameAspect {
	
	@Before("execution (* *.*(..))")
	public void beforeMethods(JoinPoint joinPoint) {
		System.out.println(joinPoint.getSignature());
		
		
	}
	
	
	@Pointcut("execution (public * (..))")
	public void getMethodNameAspectPointcut() {
		
	}

}
