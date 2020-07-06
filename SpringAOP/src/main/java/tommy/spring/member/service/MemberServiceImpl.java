package tommy.spring.member.service;

import tommy.spring.member.vo.MemberVO;
import tommy.spring.member.vo.UpdateInfo;

public class MemberServiceImpl implements MemberService {

	@Override
	public void regist(MemberVO member) {
		System.out.println("[Service] - MemberServiceImpl.regist() 메서드 실행");
	}

	@Override
	public boolean update(String memberId, UpdateInfo info) {
		System.out.println("[Service] - MemberServiceImpl.update() 메서드 실행");
		return true; // DB 작업 없으니 일단 됐다고 치자.
	}

}
