package tommy.spring.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tommy.spring.board.service.ReadArticleService;
import tommy.spring.board.vo.ArticleNotFoundException;
import tommy.spring.board.vo.ArticleVO;
import tommy.spring.member.service.MemberService;
import tommy.spring.member.vo.UpdateInfo;

public class MainTwo {
	public static void main(String[] args) {
		String[] configLocations = new String[] {"applicationContextTwo.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		ReadArticleService readArticleService = context.getBean("readArticleService", ReadArticleService.class);
		try {
			ArticleVO article1 = readArticleService.getArticleAndIncreaseReadCount(1);
			ArticleVO article2 = readArticleService.getArticleAndIncreaseReadCount(1);
			System.out.println("article1 == article2 : " + (article1 == article2));
			readArticleService.getArticleAndIncreaseReadCount(0);
		}catch(ArticleNotFoundException e) {}
		MemberService memberService = context.getBean("memberService", MemberService.class);
		memberService.update("javaline", new UpdateInfo());
		context.close();
	}
}
