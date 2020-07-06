package tommy.spring.common;

public class LoggingAdvice {
	public void before() {
		System.out.println("[LA-Before] 메서드 전 전처리 수행");
	}
	
	public void afterReturning(Object ret) {
		System.out.println("[LA-AfterReturning] 메서드 실행 후 후처리 수행, 리턴값 = " + ret);
	}
	
	public void afterThrowing(Throwable ex) {
		System.out.println("[LA-AfterThrowing] 메서드 실행 중 예외 발생, 예외 = " + ex);
	}
	
	public void afterFinally() {
		System.out.println("[LA-AfterFinally] 메서드 실행 완료 후 무조건 처리");
	}
}
