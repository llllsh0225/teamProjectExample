package tommy.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println("[실행시간 추적 로그] " + signatureString + " 시작");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed(); // 리턴값 얻어옴
			return result;
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println("[실행시간 추적 로그] " + signatureString + " 종료");
			System.out.println("[실행시간 추적 로그] " + signatureString + " 실행 시간 : " + (finish - start) + "ms");
		}
	}
}
