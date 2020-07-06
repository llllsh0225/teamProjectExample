package tommy.spring.board.service;

import tommy.spring.board.vo.ArticleNotFoundException;
import tommy.spring.board.vo.ArticleVO;

public interface ReadArticleService {
	ArticleVO getArticleAndIncreaseReadCount(int id)throws ArticleNotFoundException;
}
