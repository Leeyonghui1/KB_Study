package member;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO dao;

	// 의료진 목록 조회
	@Override
	public List<MemberVo> member_list() {
		return dao.member_list();
	}
	
	
	@Override
	public boolean member_insert(MemberVo vo) {
		return false;
	}

	@Override
	public MemberVo member_select(String id) {
		return null;
	}

	@Override
	public MemberVo member_login(HashMap<String, Object> map) {
		return dao.member_login(map);
	}

	@Override
	public boolean member_id_check(String id) {
		return false;
	}

	@Override
	public boolean member_update(MemberVo vo) {
		return false;
	}

	@Override
	public boolean member_delete(String id) {
		return false;
	}
}
