package tommy.spring.member.service;

import tommy.spring.member.vo.MemberVO;
import tommy.spring.member.vo.UpdateInfo;

public interface MemberService {
	void regist(MemberVO member);
	boolean update(String memberId, UpdateInfo info);
}
