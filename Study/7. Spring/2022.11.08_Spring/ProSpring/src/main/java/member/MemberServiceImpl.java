package member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO dao;
	
	// 아이디 중복 체크 확인
	@Override
	public boolean id_check(String id) {
		return dao.id_check(id);
	}
	
	// 회원가입
	@Override
	public String join(Map<String, Object> map) {
		int affectRowCount = this.dao.join(map);
		if(affectRowCount == 1) {
			return map.get("id").toString();
		}
		return null;
	}
	
	// 로그인
	@Override
	public MemberDTO login(HashMap<String, String> map) {
		return dao.login(map);
	}
	
	// 회원 상세 화면
	@Override
	public MemberDTO detail(String id){
		return dao.detail(id);
	}
	
	
	// 의료진 목록 조회
	@Override
	public List<MemberDTO> member_list() {
		return dao.member_list();
	}
	
}
