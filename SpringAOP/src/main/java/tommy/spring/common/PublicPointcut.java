package tommy.spring.common;

import org.aspectj.lang.annotation.Pointcut;

public class PublicPointcut {
	@Pointcut("execution(public * tommy.spring..*(..))")
	public void publicMethod() {}
}
