package member;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class MemberDAO implements MemberService{
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	// 의료진 목록 조회
	@Override
	public List<MemberVo> member_list() {
		return this.sqlSessionTemplate.selectList("customer.list");
	}
	
	@Override
	public boolean member_insert(MemberVo vo) {
		return this.sqlSessionTemplate.insert("customer.join", vo)==0?false:true;
	}

	@Override
	public MemberVo member_select(String id) {
		return null;
	}

	@Override
	public MemberVo member_login(HashMap<String, Object> map) {
		return this.sqlSessionTemplate.selectOne("member.login", map);
	}

	@Override
	public boolean member_id_check(String id) {
		return (Integer)this.sqlSessionTemplate.selectOne("member.id_check", id)==0?true:false;
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
