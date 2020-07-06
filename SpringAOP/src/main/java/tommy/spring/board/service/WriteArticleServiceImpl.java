package tommy.spring.board.service;

import tommy.spring.board.dao.ArticleDAO;
import tommy.spring.board.vo.ArticleVO;

public class WriteArticleServiceImpl implements WriteArticleService {
	//Service를 구현하려면 DAO가 필요함
	private ArticleDAO articleDao;
	
	// Default 생성자
	public WriteArticleServiceImpl() {}
	
	// articleDAO를 생성자로 주입
	public WriteArticleServiceImpl(ArticleDAO articleDao) {
		super();
		this.articleDao = articleDao;
	}

	@Override
	public void write(ArticleVO article) {
		System.out.println("[Service] - WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
	}

}
