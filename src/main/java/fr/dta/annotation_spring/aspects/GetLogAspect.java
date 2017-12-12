package fr.dta.annotation_spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GetLogAspect {
	
	@After("getLogAspectPointcut()")
	public void afterGetLog() {
		System.out.println("aspect get ! ");
		
	}
	
	@Pointcut("execution (* get*(..))")
	public void getLogAspectPointcut(){
		
	}

}
