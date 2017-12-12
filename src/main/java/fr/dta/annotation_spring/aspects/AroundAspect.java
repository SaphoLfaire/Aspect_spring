package fr.dta.annotation_spring.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {
	
	@Around()
	public void aroundAspect() {
		
	}
	
	@Pointcut("execution (* *.*(..)")
	public void aroundAspectPointcut() {
		
	}

}
