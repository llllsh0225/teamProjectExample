package tommy.spring.board.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tommy.spring.board.service.WriteArticleService;
import tommy.spring.board.vo.ArticleVO;
import tommy.spring.member.service.MemberService;
import tommy.spring.member.vo.MemberVO;

public class MainThree {
	public static void main(String[] args) {
		String[] configLocations = new String[] {"applicationContextThree.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService)context.getBean("writeArticleService");
		articleService.write(new ArticleVO());
		
		MemberService memberService = context.getBean("memberService", MemberService.class);
		memberService.regist(new MemberVO());
		
		context.close();
	}
}
