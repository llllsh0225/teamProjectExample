package tommy.spring.common;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

import tommy.spring.board.vo.ArticleVO;

/**
 * 
 * 캐시 서비스를 제공할 Advice 클래스
 */
public class ArticleCacheAdvice {
	private Map<Integer, ArticleVO> cache = new HashMap<Integer, ArticleVO>();
	public ArticleVO cache(ProceedingJoinPoint joinPoint) throws Throwable{
		Integer id = (Integer)joinPoint.getArgs()[0];
		ArticleVO article = cache.get(id);
		if(article != null) {
			System.out.println("[ACA] 캐시에서 Article[" + id + "] 구함");
			return article;
		}
		ArticleVO ret = (ArticleVO) joinPoint.proceed();
		if(ret != null) {
			cache.put(id, ret);
			System.out.println("[ACA] 캐시에 Article[" + id + "] 추가함");
		}
		return ret;
	}
}
