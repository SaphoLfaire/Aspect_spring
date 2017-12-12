package fr.dta.annotation_spring.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExceptionDeleteAspect {
	
	
	@AfterThrowing(pointcut="exceptionDeleteAspectPointcut()", throwing="ex")
	public void exceptionDelete(ArithmeticException ex) {
		
		System.out.println("EXCEPTION");
	}
	
	
	@Pointcut("execution (* delete*(..))")
	public void exceptionDeleteAspectPointcut() {
		
	}

}
