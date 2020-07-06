package tommy.spring.board.dao;

import tommy.spring.board.vo.ArticleVO;

public class OracleArticleDAO implements ArticleDAO {

	@Override
	public void insert(ArticleVO article) {
		System.out.println("[DAO] - MyOracleArticleDAO.insert() 실행");
	}

	@Override
	public void updateReadCount(int id) {
		System.out.println("[DAO] - MyOracleArticleDAO.updateReadCount() 실행");
	}

}
